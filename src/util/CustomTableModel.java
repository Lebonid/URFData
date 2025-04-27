package util;

import javax.swing.table.AbstractTableModel;
import java.lang.reflect.Field;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CustomTableModel<T> extends AbstractTableModel {

    private final Class<T> cls;
    private final String[] columnNames;
    private List<T> rows;

    public CustomTableModel(Class<T> cls, String[] columnNames, List<T> rows)
    {
        this.cls = cls;
        this.columnNames = columnNames;
        this.rows = rows;
    }

    @Override
    public int getRowCount() {
        return rows.size();
    }


    @Override
    public int getColumnCount() {
        return cls.getDeclaredFields().length;
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        return cls.getDeclaredFields()[columnIndex].getType();
    }

    @Override
    public String getColumnName(int column) {
        return column >= columnNames.length ? "NAME" : columnNames[column];
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        try {

            Field field = cls.getDeclaredFields()[columnIndex];
            field.setAccessible(true);
            return field.get(this.rows.get(rowIndex));
        } catch (IllegalAccessException e) {
            e.printStackTrace();
            return "ERROR";
        }
    }

    public void sort(Comparator<T> comparator) {
        Collections.sort(rows, comparator);
        fireTableDataChanged();
    }

    public List<T> getRows() {
        return rows;
    }

    public void setRows(List<T> rows) {
        this.rows = rows;
    }
}

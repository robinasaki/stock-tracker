package view;

import interface_adapter.holdings.HoldingsViewModel;
import interface_adapter.holdings.HoldingsState;
import interface_adapter.ViewManagerModel;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class HoldingsView extends JPanel {
    public final String viewName = "holdings";

    private final HoldingsViewModel viewModel;
    private ViewManagerModel viewManagerModel;

    public HoldingsView(HoldingsViewModel viewModel, ViewManagerModel viewManagerModel) {
        this.viewModel = viewModel;
        this.viewManagerModel = viewManagerModel;
        initView();
    }

    private void initView() {
        JPanel panel = new JPanel();

        // Create table model
        DefaultTableModel tableModel = new DefaultTableModel();
        tableModel.addColumn("Symbol");
        tableModel.addColumn("Price");
        tableModel.addColumn("Quantity");
        tableModel.addColumn("Value");

        // Populate table
        List<String> symbols = viewModel.getState().getSymbols();
        List<Double> quotes = viewModel.getState().getQuotes();
        List<Double> shares = viewModel.getState().getShares();
        List<Double> values = viewModel.getState().getValues();
        for (int i = 0; i < symbols.size() - 1; i++) {
            Object[] row = {symbols.get(i), quotes.get(i), shares.get(i), values.get(i)};
            tableModel.addRow(row);
        }

        // Create table
        JTable table = new JTable(tableModel);
        this.add(table);

        JScrollPane scrollPane = new JScrollPane(table);

        panel.add(scrollPane);

        add(panel);
    }


    
}


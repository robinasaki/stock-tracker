package view;

import interface_adapter.DeletePortfolio.DeletePortfolioState;
import interface_adapter.DeletePortfolio.DeletePortfolioViewModel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class DeletePortfolioView extends JFrame implements ActionListener{
    private final String ViewName = "Delete Portfolio";
    private final DeletePortfolioViewModel deletePortfolioViewModel;

    final JButton confirm;
    final JButton cancel;

    public DeletePortfolioView(DeletePortfolioViewModel deletePortfolioViewModel){
        this.deletePortfolioViewModel = deletePortfolioViewModel;
        this.deletePortfolioViewModel.addPropertyChangeListener(this);

        JLabel title = new JLabel("Delete Portfolio Screen");
        title.setAlignmentX(Component.CENTER_ALIGNMENT);
        JPanel buttons = new JPanel();
        confirm = new JButton(deletePortfolioViewModel.CONFIRM_BUTTON_LABEL);
        buttons.add(confirm);
        cancel = new JButton(deletePortfolioViewModel.CANCEL_BUTTON_LABEL);
        buttons.add(cancel);

        confirm.addActionListener(this);
        cancel.addActionListener(this);

        // TODO: not finished yet
    }
}

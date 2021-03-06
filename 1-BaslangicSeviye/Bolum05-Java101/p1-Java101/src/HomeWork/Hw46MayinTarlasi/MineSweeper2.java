package HomeWork.Hw46MayinTarlasi;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MineSweeper2 implements MouseListener {
    JFrame frame;
    Btn[][] board = new Btn[10][10];
    int openButton;

    public MineSweeper2() {
        openButton = 0;

        frame = new JFrame("Mayın Tarlası");
        frame.setSize(800, 800);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(10, 10));

        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[0].length; col++) {
                Btn btn = new Btn(row, col);
                frame.add(btn);
                btn.addMouseListener(this);
                board[row][col] = btn;
            }
        }

        generateMine();
        updateCount();
        printMine();

        frame.setVisible(true);
    }

    public void generateMine() {
        int i = 0;
        while (i < 10) {
            int randRow = (int) (Math.random() * board.length);
            int randCol = (int) (Math.random() * board[0].length);

            while (board[randRow][randCol].isMine()) {
                randRow = (int) (Math.random() * board.length);
                randCol = (int) (Math.random() * board[0].length);
            }
            board[randRow][randCol].setMine(true);
            i++;
        }
    }

    public void print() {
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[0].length; col++) {
                if (board[row][col].isMine()) {
                    board[row][col].setIcon(new ImageIcon("src/Assets/mine.png"));
                } else {
                    board[row][col].setText(board[row][col].getCount() + "");
                    board[row][col].setEnabled(false);
                }
            }
        }
    }

    public void printMine(){
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[0].length; col++) {
                if (board[row][col].isMine()) {
                    board[row][col].setIcon(new ImageIcon("src/Assets/mine.png"));
                }
            }
        }
    }

    public void updateCount() {
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[0].length; col++) {
                if (board[row][col].isMine()) {
                    counting(row, col);
                }
            }
        }
    }

    public void counting(int row, int col) {
        for (int i = row - 1; i <= row + 1; i++) {
            for (int j = col - 1; j <= col + 1; j++) {
                try {
                    int value = board[i][j].getCount();
                    board[i][j].setCount(++value);
                } catch (Exception e) {

                }
            }
        }
    }

    public void open(int r, int c) {
        if (r < 0 || r >= board.length || c < 0 || c >= board[0].length || board[r][c].getText().length() > 0
                || board[r][c].isEnabled() == false) {
            return;
        } else if (board[r][c].getCount() != 0) {
            board[r][c].setText(board[r][c].getCount() + "");
            board[r][c].setEnabled(false);
            openButton++;
        } else {
            openButton++;
            board[r][c].setEnabled(false);
            open(r - 1, c);
            open(r + 1, c);
            open(r, c - 1);
            open(r, c + 1);
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        Btn b = (Btn) e.getComponent();
        if (e.getButton() == 1) {
            if (b.isMine()) {
                JOptionPane.showMessageDialog(frame, "Mayına bastınız. Oyun bitti.");
                print();
            } else {
                open(b.getRow(), b.getCol());
                if (openButton == (board.length * board[0].length) - 10) {
                    JOptionPane.showMessageDialog(frame, "Tebrikler. Kazandınız.");
                    print();
                }
            }
        } else if (e.getButton() == 3) {
            if (!b.isFlag()) {
                b.setIcon(new ImageIcon("src/Assets/flag.png"));
                b.setFlag(true);
            } else {
                b.setIcon(null);
                b.setFlag(false);
            }
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}

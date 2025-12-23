import javax.swing.*;
import java.awt.*;

public class GraficaManual extends JPanel {

    private int[] valores = {10, 40, 30, 20, 50};
    private String[] etiquetas = {"A", "B", "C", "D", "E"};

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;

        int anchoBarra = 50;
        int espacio = 20;
        int x = 50;
        int baseY = 250;

        // Dibujar ejes
        g2.drawLine(40, baseY, 400, baseY); // eje X
        g2.drawLine(40, baseY, 40, 50);    // eje Y

        // Dibujar barras
        for (int i = 0; i < valores.length; i++) {
            int altura = valores[i] * 3; // Escala
            g2.setColor(Color.BLUE);
            g2.fillRect(x, baseY - altura, anchoBarra, altura);
            g2.setColor(Color.BLACK);
            g2.drawRect(x, baseY - altura, anchoBarra, altura);
            g2.drawString(etiquetas[i], x + 15, baseY + 15);
            x += anchoBarra + espacio;
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Gráfica sin librerías");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 350);
        frame.add(new GraficaManual());
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}

import javax.swing.*;

public class GuiByText extends JFrame {
    //constructor
    //sama dengan nama class
    //tidak diawali void/tipe data lainnya
    //jalan ketika objek diinstance

    GuiByText(){
        setSize(640, 480);
    }

    public static void main(String[] args) {
        GuiByText guiByText = new GuiByText();
        guiByText.setVisible(true);
    }
}

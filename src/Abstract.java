interface Button {
    void render();
}

interface Window {
    void open();
}

class WindowsButton implements Button {
    public void render() {
        System.out.println("Rendering Windows Button");
    }
}

class WindowsWindow implements Window {
    public void open() {
        System.out.println("Opening Windows Window");
    }
}

class MacButton implements Button {
    public void render() {
        System.out.println("Rendering Mac Button");
    }
}

class MacWindow implements Window {
    public void open() {
        System.out.println("Opening Mac Window");
    }
}

interface UIFactory {
    Button createButton();
    Window createWindow();
}

class WindowsFactory implements UIFactory {
    public Button createButton() {
        return new WindowsButton();
    }

    public Window createWindow() {
        return new WindowsWindow();
    }
}

class MacFactory implements UIFactory {
    public Button createButton() {
        return new MacButton();
    }

    public Window createWindow() {
        return new MacWindow();
    }
}

public class Abstract {
    public static void main(String[] args) {
        UIFactory factory = new WindowsFactory();
        Button button = factory.createButton();
        Window window = factory.createWindow();

        button.render();
        window.open();
    }
}
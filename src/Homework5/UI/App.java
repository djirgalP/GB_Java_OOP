package Homework5.UI;

import Homework5.Config;
import Homework5.Core.MVP.Presenter;
import Homework5.Core.MVP.View;

import java.util.Scanner;

public class App {
    public static void ButtonClick() {
        System.out.print("\033[H\033[J");// ru.stackoverflow.com/questions/1315049/Как-очистить-консоль-в-java-во-время-действия-программы
        View view = new ConsoleView();
        Presenter presenter = new Presenter(view, Config.pathDb);
        presenter.LoadFromFile();

        try (Scanner in = new Scanner(System.in)) {

            while (true) {
                System.out.println(" 1 - prev  2 - next 3 - delete current 4 - add contact 5 - save 6 - export");
                String key = in.next();
                System.out.print("\033[H\033[J");
                switch (key) {
                    case "1":
                        presenter.prev();
                        break;
                    case "2":
                        presenter.next();
                        break;
                    case "3":
                        presenter.remove();
                    case "4":
                        presenter.add();
                        break;
                    case "5":
                        presenter.saveToFile();
                        break;
                    case "6":
                        presenter.exportToFile();
                        break;
                    default:
                        System.out.println("No such command");
                        break;
                }
            }
        }

    }
}

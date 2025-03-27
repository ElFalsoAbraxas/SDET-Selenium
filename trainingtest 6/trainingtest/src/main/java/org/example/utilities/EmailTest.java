package org.example.utilities;

import java.util.Objects;

import org.example.methods.Methods;
import org.example.reports.ExtentReport;

public class EmailTest {
    public static void Email(String email) {
        int s = 0;
        int c = 600;
        int x = 0;
        String count = "";
        Methods google = new Methods();
/*
        do {
            try {
                Execute.Action(Action.clearTxt, google.txt_email(), "");
                count = String.valueOf(c);
                Execute.Action(Action.type, google.txt_email(), email.concat(count).concat("@test.com"));
                Execute.Action(Action.click, google.btn_submit(), "");
            } catch (Exception e1) {
                s = 1;
            }

            if (x == 0) {
                Execute.ExecuteExplicitWait(Action.attributeToBe, google.msg_error(), "style", "", 10);
                c++;
                x++;
                continue;
            }
            Execute.Action(Action.getAttribute, google.msg_error(), "style");
            System.out.println(Execute.attribute);
            try {
                try {
                    Execute.ExecuteExplicitWait(Action.attributeContains, google.msg_error(), "style", "display: block;", 10);
                    Execute.Action(Action.getAttribute, google.msg_error(), "style");
                    System.out.println(Execute.attribute);
                } catch (Exception e) {

                    if (Execute.attribute.equals("display: none;")) {
                        s = 1;
                        c++;
                    }
                }

                if (Execute.attribute.equals("display: block;")) {
                    c++;
                }

            } catch (Exception e) {
                s = 1;
            }

        } while (s == 0);
        System.out.println("salio");
        ExtentReport.test.pass("Email Accepted");

 */
    }
}

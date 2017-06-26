/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

/**
 *
 * @author avijitkumar
 */
public class ConvertDollarsToRupee {

    public static void main(String... args) throws IOException {
        Document page = Jsoup.connect(
                "http://www.xe.com/currencyconverter/convert/?Amount="
                + args[0]
                + "&From=USD&To=INR"
        ).get();
        System.out.println(args[0]
                + "USD == "
                + page.select("span.uccResultAmount").text()
                + "INR"
        );
    }

}

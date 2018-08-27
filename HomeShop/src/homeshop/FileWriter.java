/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homeshop;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileWriter implements Writer {
    private String filename;
    private Path path;
    private String content;

    public FileWriter(String filename) {
        this.filename = filename;
    }

    @Override
    public void start() {
        path = Paths.get(filename);
        content = "";
    }

    @Override
    public void writeLine(String line) {
        content += line + "%n";
    }

    @Override
    public void stop() {
        try {
            Files.write(path, String.format(content).getBytes());
        } catch (IOException e) {
            System.err.println("Impossible de rédiger la facture");
        }
    }
}

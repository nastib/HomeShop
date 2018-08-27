/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homeshop;

public interface Writer {
    /**
     * Start writing process
     */
    public void start();

    /**
     * Write on line
     * @param line
     */
    public void writeLine(String line);

    /**
     * Stop writing process
     */
    public void stop();
}
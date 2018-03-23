package cn.printer.printer;

import cn.printer.Ink.Ink;
import cn.printer.paper.Paper;

/**
 * Created by MESGOD纯贱 on 2018/3/3.
 */
public class Printer {
    private Ink ink;
    private Paper paper;

    public void print(){
        System.out.println("使用"+ink.getColor()+"打印在"+paper.getPaper()+"上");
    }


    public Ink getInk() {
        return ink;
    }

    public void setInk(Ink ink) {
        this.ink = ink;
    }

    public Paper getPaper() {
        return paper;
    }

    public void setPaper(Paper paper) {
        this.paper = paper;
    }
}

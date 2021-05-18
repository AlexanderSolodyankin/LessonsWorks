package HomeWorks.homeworks24.Chess;
/*
Страница 1
 */

import java.awt.*;

/**
 * Создаю класс фигура как указанно в задании первое действие
 */

 class FigureChess {
//     private int x;
//     private int y;
/**
 * Что бы не парится создаю клас положения фигуры по оси "Х" и оси "У" для этого создам класс
  */
    private LocationFigureDraft local;
    private Color col;
    private boolean inVis;

    protected FigureChess(LocationFigureDraft local, Color col, boolean inVis){
     this.local = local;
     this.col = col;
     this.inVis = inVis;
    }

 public LocationFigureDraft getLocal() {
  return local;
 }

 public void setLocal(LocationFigureDraft local) {
  this.local = local;
 }

 public Color getCol() {
  return col;
 }

 public void setCol(Color col) {
  this.col = col;
 }

 public boolean isInVis() {
  return inVis;
 }

 public void setInVis(boolean inVis) {
  this.inVis = inVis;
 }

 // Создаю метод speak возврощаюший информацию о фигуре
 public String speak(){

     return String.format("Положение по Оси Х: %s  и Оси У: %s\n" +
         "Цвет фигруы: %s\n" +
         "Виднали фигура: \n", local.getX(), local.getY(), col, inVis ? "Видна" : "Не видна");}
                                     // В конце строки используется логика используя булиян переменную для вывода

 /*
           На данном этапи с классом фигура мы закончили.
           И теперь приступаем к созданию класса Прямоугольник
  */
}

package com.company;

public class Main {
    public static void main(String[] args) {
        Ball ballOne = new Ball(); 
        
        ballOne.color = "BLUE"; // null
        ballOne.price = 10; // null
        ballOne.radius = 6; // null
        ballOne.producerCountry = "China"; // null

        System.out.println(ballOne.color + " " + ballOne.price + " " + ballOne.radius + " " + ballOne.producerCountry);

        Website websiteOne = new Website();
        websiteOne.domain = "tdsai.com";
        websiteOne.ipAddress = "168.1.1.0";
        websiteOne.category = "Business";
        websiteOne.location = "Sweden";

        System.out.println(websiteOne.ipAddress + " " + websiteOne.domain + " " + websiteOne.category + " " + websiteOne.location);

        Website websiteTwo = new Website();
        websiteTwo.domain = "it-academy.com";
        websiteTwo.ipAddress = "123.3.2.1";
        websiteTwo.category = "Education";
        websiteTwo.location = "Kyrgyzstan";

        System.out.println(websiteTwo.ipAddress + " " + websiteTwo.domain + " " + websiteTwo.category + " " + websiteTwo.location);

        Website websiteThree = new Website();
        websiteThree.domain = "facebook.com";
        websiteThree.ipAddress = "104.5.2.1";
        websiteThree.category = "Social Media";
        websiteThree.location = "USA";

        System.out.println(websiteThree.ipAddress + " " + websiteThree.domain + " " + websiteThree.category + " " + websiteThree.location);

        // в переменной ballOne хранится ссылка (адрес ячейки) на объект Ball
        // в методе main (возможен любой другой) создали объект ballOne по чертежу Ball
        // ключевое слово new - говорит JAVA, что надо выделить память для нового объекта. После выполнения данной строки создается объект
        // создание и заполнение объекта
        // чтобы обратиться к свойству просто обращаемся через точку ballOne.color
        // Работаем как с обычными переменными
    }
}

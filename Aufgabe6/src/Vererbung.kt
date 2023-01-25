fun main(){
    var kruemel: Meerschweinchen = Meerschweinchen("Kruemel", 3, 25)
    kruemel.pet()
    println("Dein Haustier heisst " + kruemel.name + " und ist " + kruemel.age + " Jahre alt.")
    println(kruemel.jump(30))
}

/*
    Was gibt das Programm aus?
        - Siehe Ausführung
    Wir instanziieren eine Meerschweinchen-Instanz. In der Meerschweinchen-Klasse ist keine Methode pet(), dennoch können wir die Meerschweinchen-Instanz mit pet() streicheln. Warum?
        - Weil das Objekt der Klasse Meerschweinchen die Methode pet() von der Super-Klasse Haustier vererbt.
    Die Meerschweinchen-Klasse hat keine Eigenschaften name und age, dennoch können wir über die Meerschweinchen-Instanz auf die Eigenschaften zugreifen. Warum?
        - Weil das Objekt der Klasse Meerschweinchen die Attribute(Eigenschaften) von der Super-Klasse Haustier vererbt.
    Was macht das Keyword? open
        - Es stellt eine Klasse zur Vererbung als Super-Klasse bereit bzw. deklariert es als eine Super-Klasse
    Was macht der Codeausschnitt hier? : Haustier(name, age)
        - Dieser Codeausschnitt gibt bei der Instanzierung die Paramter von dem Konstruktor der Sub-Klasse an den Konstruktor der Super-Klasse weiter
*/
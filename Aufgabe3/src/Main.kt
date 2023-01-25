class Person {
    var age: Int

    constructor(age: Int) {
        this.age = age
    }

    fun birthday(){
        age = age + 1
    }

    fun isUnderage() : Boolean {
        return(age < 18)
    }
}

var person = Person(15)
person.birthday()
println(person.isUnderage())

/*
    Eine Klasse Person wird mit der Eigenschaft age (alter) deklariert
    Die Funktion Birthday erhöht das Alter um 1
    Die Funktion isUnderage prüft ob die Person minderjährig ist.
*/
fun main(){

    var pages: List<Page> = listOf(
        Page("Dies ist die erste Seite des Buches!"),
        Page("Dies ist die zweite Seite des Buches!"),
        Page("Dies ist die dritte Seite des Buches!"),
        Page("Dies ist die vierte Seite des Buches!"),
        Page("Dies ist die fünfte Seite des Buches!"),
        Page("Dies ist die sechste Seite des Buches!"),
        Page("Dies ist die siebte Seite des Buches!"),
        Page("Dies ist die achte Seite des Buches!")
    )
    var book: Book = Book(pages)

    while(true){
        book.read()
        println("\"+\" zum weiterblättern, \"-\" zum zurückblättern!\nfinish zum beenden")
        var eingabe = readln()

        if(eingabe == "+"){
            try{
                book.nextPage()
            }catch(e: ArrayIndexOutOfBoundsException){
                println("Du bist bereits am Ende des Buches!\n")
            }
        }else if(eingabe == "-"){
            try{
                book.previousPage()
            }catch(e: ArrayIndexOutOfBoundsException){
                println("Du bist bereits am Anfang des Buches!\n")
            }
        }else if(eingabe == "finish"){
            break
        }else{
            println("\nUngültige Eingabe!\n")
            continue
        }
    }
}
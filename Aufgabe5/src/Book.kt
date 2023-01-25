open class Book{
    var pages: List<Page>
    var actualPage: Page

    constructor(book: List<Page>){
        this.pages = book
        this.actualPage = pages.first()
    }

    fun read(){
        actualPage.read()
        nextPage()
        actualPage.read()
    }

    fun nextPage(){
        try{
            actualPage = pages[pages.indexOf(actualPage) + 1]
        }catch(e: ArrayIndexOutOfBoundsException){
            println("Ende des Buches erreicht!\n")
        }
    }

    fun previousPage(){
        try{
            actualPage = pages[pages.indexOf(actualPage) - 3]
        }catch(e: ArrayIndexOutOfBoundsException){
            println("Ende des Buches erreicht!\n")
        }
    }
}
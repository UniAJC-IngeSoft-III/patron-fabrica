
#Create a new project from archetype on the command line

##Prerequisites  

* Java 1.7 or higher 
* In my case I have Maven Apache Maven 3.2.2 installed on my system 
* A plain text editor, eg vim, nano, emacs, ...any of your preference

execute a command line:

    mvn archetype:create -DgroupId=org.unijac.ingesoft3 -DartifactId=Patron-Fabrica -DarchetypeArtifactId=maven-archetype-quickstart
    
##Create a repository

I use git, on github.com

    cd Patron-Fabrica
    git init
    git add README.md
    git commit -m "first commit"
    git remote add origin git@github.com:UniAJC-IngeSoft-III/patron-fabrica.git
    git push -u origin master

##External references
 * [JOptionPane Dialog Reference](http://www.java2s.com/Tutorial/Java/0240__Swing/CreatingaJOptionPane.htm)
 * [Material de clases](https://sites.google.com/site/vdmfclases/patrones-de-software/clases?pli=1)


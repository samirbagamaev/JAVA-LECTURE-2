//СТРОКИ 



//Создать строку из 1 млн плюсиков. Как?

 package WORK;

// /**
//  * program
//  */
public class program {

    public static void main(String[] args) {
         
        String str = "";
        for (int i = 0; i < 1_000_000; i++) {
        str += "+";
    }
    ;
    
}
} 

//ОТВЕТ: ПРИМЕРНО 41000 МС = ПРИМЕРНО 40 СЕКУНД НА ВЫПОЛНЕНИЕ


//---------------------------------------------------------------------------------

//ИЛИ ЖЕ ВОТ ТАК

package WORK;

public class program {
 public static void main(String[] args) {
 var s = System.currentTimeMillis();
 
 StringBuilder sb = new StringBuilder();
 for (int i = 0; i < 1_000_000; i++) {

 sb.append("+");
 }
 System.out.println(System.currentTimeMillis() - s);

 }
}

//ОТВЕТ: ПРИМЕРНО 9000 МС = ПРИМЕРНО 9 СЕКУНД НА ВЫПОЛНЕНИЕ



//------------------------------------------------------------------------


// concat(): объединение строк
// valueOf(): преобразует Object в строковое представление (завязан на toString())
// join(): объединяет набор строк в одну с учетом разделителя
// charAt(): получение символа по индексу
// indexOf(): первый индекс вхождения подстроки
// lastIndexOf(): последний индекс вхождения подстроки
// startsWith()/endsWith(): определяет, начинается/заканчивается ли строка с подстроки
// replace(): замена одной подстроки на другую


// trim(): удаляет начальные и конечные пробелы
// substring(): возвращает подстроку, см.аргументы
// toLowerCase()/toUpperCase(): возвращает новую строку в нижнем/верхнем регистре
// сompareTo(): сравнивает две строки
// equals(): сравнивает строки с учетом регистра
// equalsIgnoreCase(): сравнивает строки без учета регистра
// regionMatches(): сравнивает подстроки в строках




//---------------------------------------------------------------------------
 

package WORK;

public class program {
 public static void main(String[] args) {
 String[] name = { "C", "е", "р", "г", "е", "й" };
 String sk = "СЕРГЕЙ КА.";
 System.out.println(sk.toLowerCase()); // сергей ка.
 System.out.println(String.join("", name)); // Cергей
 System.out.println(String.join("", "C", "е", "р", "г", "е", "й"));
 // C,е,р,г,е,й
 System.out.println(String.join(",", "C", "е", "р", "г", "е", "й"));
 }
}





////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////

//String vs StringBuilder


// Много изменений – String
// Много преобразований – StringBuilder



////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////

//РАБОТА С ФАЙЛОВОЙ СИСТЕМОЙ

// Для работы нужно:

// File <имя> = new File(<полный путь к файлу>);
// File f1 = new File("file.txt");
// File f2 = new File("/Users/sk/vscode/java_projects/file.txt");






//-----------------------------------------------------------------------

import java.io.File;
public class fileSystemDemo {
 public static void main(String[] args) {
 String pathProject = System.getProperty("user.dir");
 String pathFile = pathProject.concat("/file.txt");
 File f3 = new File(pathFile);
 System.out.println(f3.getAbsolutePath ());
 // /Users/sk/vscode/java_projects/file.txt
 // C:/Users/Sk/Documents/xxx/brainexplosion/java/file.txt
 }
}




//-------------------------------------------------------------------

// Работа с файловой системой. Файлы. Ошибки

// try {
//     Код, в котором может появиться ошибка
//    } catch (Exception e) {
//     Обработка, если ошибка случилась
//    }
//    finally {
//     Код, который выполнится в любом случае
//    }
   




//-------------------------------------------------------------------

// Работа с файловой системой. Файлы. Ошибки

import java.io.File;
public class tryDemo {
 public static void main(String[] args) {
 try {
 String pathProject = System.getProperty("user.dir");
 String pathFile = pathProject.concat("/file.txt");
 File f3 = new File(pathFile);
 System.out.println("try");
 } catch (Exception e) {
 System.out.println("catch");
 }
 finally
 { System.out.println("finally"); }
 }
}






//-------------------------------------------------------------------

// Работа с файловой системой. Файлы. Ошибки

import java.io.File;
public class tryDemo {
 public static void main(String[] args) {
 try {
 String pathProject = System.getProperty("user.dir");
 String pathFile = pathProject.concat("/file.txt");
 File f3 = new File(pathFile);
 System.out.println("try");
 } catch (Exception e) {
 System.out.println("catch");
 }
 finally
 { System.out.println("finally"); }
 }
}
// Всё ли ок?





//-------------------------------------------------------------------

// Работа с файловой системой. Файлы. Ошибки

import java.io.File;
public class tryDemo {
 public static void main(String[] args) {
 try {
 String pathProject = System.getProperty("user.dir");
 String pathFile = pathProject.concat("/file.txt");
 File file = new File(pathFile);
 if (file.createNewFile()) {
 System.out.println("file.created");
 }
 else {
 System.out.println("file.existed");
 }
 } catch (Exception e) {
 System.out.println("catch");
 } finally {
 System.out.println("finally");
}





//-------------------------------------------------------------------

// Работа с файловой системой. Файлы. Ошибки


import java.io.File;
public class tryDemo {
 public static void main(String[] args) {
 try {
 String pathProject = System.getProperty("user.dir");
 String pathFile = pathProject.concat("/file.txt");
 File file = new File(pathFile);
 if (file.createNewFile()) {
 System.out.println("file.created");
 }
 else {
 System.out.println("file.existed");
 }
 } catch (Exception e) {
 System.out.println("catch");
 } finally {
 System.out.println("finally");
}





//-------------------------------------------------------------------
//-------------------------------------------------------------------

// isHidden(): возвращает истину, если каталог или файл является скрытым
// length(): возвращает размер файла в байтах
// lastModified(): возвращает время последнего изменения файла или каталога
// list(): возвращает массив файлов и подкаталогов, которые находятся в каталоге
// listFiles(): возвращает массив файлов и подкаталогов, которые находятся
// в определенном каталоге
// mkdir(): создает новый каталог
// renameTo(File dest): переименовывает файл или каталог

// length(): возвращает размер файла в байтах
// lastModified(): возвращает время последнего изменения
// файла или каталога
// list(): возвращает массив файлов и подкаталогов, которые находятся в каталоге
// listFiles(): возвращает массив файлов и подкаталогов, которые
// находятся в определенном каталоге
// mkdir(): создает новый каталог
// renameTo(File dest): переименовывает файл или каталог





//-------------------------------------------------------------------


//Работа с файловой системой. Каталоги

import java.io.File;
public class Ex0043 {
 public static void main(String[] args) {
 String pathProject = System.getProperty("user.dir");
 String pathDir = pathProject.concat("/files");
 File dir = new File(pathDir);
 System.out.println(dir.getAbsolutePath ());
 if (dir.mkdir()) {
 System.out.println("+");
 } else {
 System.out.println("-");
 }
 for (String fname : dir.list()) {
 System.out.println(fname);
 } }
}






////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////

//ЛОГИРОВАНИЕ

// Логирование. Использование. Основы

// Использование
// Logger logger = Logger.getLogger()

// Уровни важности
// INFO, DEBUG, ERROR, WARNING и др.

// Вывод
// ConsoleHandler info = new ConsoleHandler();
// log.addHandler(info);

// Формат вывода: структурированный, абы как*
// XMLFormatter, SimpleFormatte






//-------------------------------------------------------------------

//Логирование. Использование. Основы

import java.util.logging.*;
public class Ex0043 {
 public static void main(String[] args) {
 Logger logger = Logger.getLogger(Ex0043.class.getName());
 logger.setLevel(Level.INFO);
 ConsoleHandler ch = new ConsoleHandler ();
 logger.addHandler(ch);
 SimpleFormatter sFormat = new SimpleFormatter ();
 ch.setFormatter(sFormat);
 logger.log(Level.WARNING, "Тестовое логирование" );
 logger.info("Тестовое логирование" );
 }
}






//-------------------------------------------------------------------

//Логирование. Использование. Основы


import java.util.logging.*;
public class Ex0043 {
 public static void main(String[] args) {
 Logger logger = Logger.getLogger(Ex0043.class.getName());
 logger.setLevel(Level.INFO);
 ConsoleHandler ch = new ConsoleHandler();
 logger.addHandler(ch);
 //SimpleFormatter sFormat = new SimpleFormatter();
 XMLFormatter xml = new XMLFormatter();
 //ch.setFormatter(sFormat);
 ch.setFormatter(xml);
 logger.log(Level.WARNING, "Тестовое логирование");
 logger.info("Тестовое логирование");
 }
}
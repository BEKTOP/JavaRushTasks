package com.javarush.task.task31.task3110;

import com.javarush.task.task31.task3110.exception.PathIsNotFoundException;
import com.javarush.task.task31.task3110.exception.WrongZipFileException;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.zip.ZipOutputStream;

public class Archiver {
    public static void main(String[] args) throws IOException {


//        Operation operation = null;
//        do {
//            try {
//                operation = askOperation();
//                CommandExecutor.execute(operation);
//            } catch (WrongZipFileException e) {
//                ConsoleHelper.writeMessage("Вы не выбрали файл архива или выбрали неверный файл.");
//            } catch (Exception e) {
//                ConsoleHelper.writeMessage("Произошла ошибка. Проверьте введенные данные.");
//            }
//
//        } while (operation != Operation.EXIT);
//    }
//
//
//    public static Operation askOperation() throws IOException {
//        ConsoleHelper.writeMessage("");
//        ConsoleHelper.writeMessage("Выберите операцию:");
//        ConsoleHelper.writeMessage(String.format("\t %d - упаковать файлы в архив", Operation.CREATE.ordinal()));
//        ConsoleHelper.writeMessage(String.format("\t %d - добавить файл в архив", Operation.ADD.ordinal()));
//        ConsoleHelper.writeMessage(String.format("\t %d - удалить файл из архива", Operation.REMOVE.ordinal()));
//        ConsoleHelper.writeMessage(String.format("\t %d - распаковать архив", Operation.EXTRACT.ordinal()));
//        ConsoleHelper.writeMessage(String.format("\t %d - просмотреть содержимое архива", Operation.CONTENT.ordinal()));
//        ConsoleHelper.writeMessage(String.format("\t %d - выход", Operation.EXIT.ordinal()));
//
//        return Operation.values()[ConsoleHelper.readInt()];
    }

    public void createZip(Path source) throws Exception {
        // Проверяем, существует ли директория, где будет создаваться архив
        // При необходимости создаем ее

        Path zipFile = source;
        Path zipDirectory = zipFile.getParent();
        if (Files.notExists(zipDirectory))
            Files.createDirectories(zipDirectory);

        // Создаем zip поток
        try (ZipOutputStream zipOutputStream = new ZipOutputStream(Files.newOutputStream(zipFile))) {

            if (Files.isDirectory(source)) {
                // Если архивируем директорию, то нужно получить список файлов в ней
                FileManager fileManager = new FileManager(source);
                List<Path> fileNames = fileManager.getFileList();

                // Добавляем каждый файл в архив

            }
        }
    }
}
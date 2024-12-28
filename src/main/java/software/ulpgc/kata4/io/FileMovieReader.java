package software.ulpgc.kata4.io;

import software.ulpgc.kata4.model.Movie;

import java.io.*;

public class FileMovieReader implements MovieReader, AutoCloseable{
    private final MovieDeserializer deserializer;
    private BufferedReader reader;

    public FileMovieReader(MovieDeserializer deserializer, File file) throws IOException {
        this.deserializer = deserializer;
        this.reader = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
    }

    @Override
    public Movie read() throws IOException {
        return deserialize(reader.readLine());
    }
    private Movie deserialize(String line){
        return line != null ? deserializer.deserialize(line) : null;
    }

    @Override
    public void close() throws Exception {
        this.reader.close();
    }
}

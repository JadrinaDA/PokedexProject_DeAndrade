After cloning this repository, if you have a Java environment on your machine, you can directly run the commands.


# Build the project

```
./gradlew build
```



# Run the application

```
./gradlew run
```

To run the application with command line arguments :

```
./gradlew run --args="premierArgument secondArgument"
```
The first argument should be the pokemon ID, if using database it must be between 1 and 5, the second is the database url. There is a database already in the folder with the url pokemondatabase.sqlite.

# Run the tests

```
./gradlew test
```

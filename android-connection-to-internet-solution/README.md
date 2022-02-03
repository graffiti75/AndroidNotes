# Connection to the internet

# Topics
- How to use Retrofit
- Parse a Json Response
- Coroutines and Deferred
- Exception & Error Handling
- Parcel and Parcelable
- Use a library to download and display images

## Basic Requirements

Complete exercises below

## Exercise 1. Getting data from internet using Retrofit

- Given the app into [this repository](https://github.com/graffiti75/AndroidNotes/tree/master/android-connection-to-internet/android-connection-to-internet_ex1), containing a MVVM Architecture (using `LiveData` and `ViewModel`):
	- Implement all TODO's from the source code
	- Use [TheMovieDb API](https://www.themoviedb.org/documentation/api) to show a list of movies from **the current year**
	- This app contains a main screen that should show a list of movies released in the current year
		- This list must be implement via `RecyclerView` and `ViewHolder`
		- Use also `DiffUtil`, `DataBinding` and `Binding Adapter`
	- Each adapter item should show the `poster` (that's an image), `title` and `rating` of the current movie in the following format:  

		<img width="270" height="480" src="images/exercise1_image1.png">

- You will need to use Retrofit into this app
	- In this exercise you will use Retrofit with a `Call` return type
- Also, you'll need to implement error handling logic checking when there's no Internet connection to retrieve data
- And you will need to use `Data Binding`

### Solution

- Check the source code

## Exercise 2. Coroutines, Retrofit & Error Handling

- Apply Coroutines to the previous example (so, in this example, you won't be using the `Call` return type anymore)

### Solution

- Check the source code

## Resources

- [How to use Retrofit](https://guides.codepath.com/android/consuming-apis-with-retrofit)
- [Coroutines and Deferred](https://medium.com/android-beginners/mvvm-with-kotlin-coroutines-and-retrofit-example-d3f5f3b09050)
- [Exception & Error Handling](https://developer.android.com/kotlin/coroutines)
- [Use a library to download and display images](https://guides.codepath.com/android/Displaying-Images-with-the-Glide-Library)

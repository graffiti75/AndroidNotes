
# Testing

# Topics
- Unit tests
- UI tests
- Integration tests

## Basic Requirements

Complete exercises below

## Exercise 1. Integration Test

- Given [this repository](https://github.com/graffiti75/AndroidNotes/tree/master/android-testing/android-testing_ex1) with the class below:

	```
	class ResourceComparer {
	    fun isEqual(context: Context, resId: Int, string: String): Boolean {
		return context.getString(resId) == string
	    }
	}
	```

	- Create a test class called `ResourceComparerTest`
	- This class must create an Integration Test
	- Inside this class you will need to create two test methods:
		- `givenStringResourceSameAsGivenString_thenReturnsTrue`
		- `givenStringResourceDifferentAsGivenString_thenReturnsFalse`


## Exercise 2. UI Test with RecyclerView

- Given the app into [this repository](https://github.com/graffiti75/AndroidNotes/tree/master/android-testing/android-testing_ex2):
	- Create a test class called `RecyclerViewSampleTest`
	- This class must create a UI Test using `Espresso`
	- Inside this class you will need to create a test method called `givenRecyclerView_whenScrollToItem_thenCheckItsTextIsCorrect()`
	- This test must check:
		- **Given** the `RecyclerView` from `MainActivity`
		- **When** we scroll to a given position of the `RecyclerView` (position `40`, for instance)
		- **Then** the item text must be "This is element #40"

## Exercise 3. Unit Test with TDD

- Using TDD methodology, and given [this repository](https://github.com/graffiti75/AndroidNotes/tree/master/android-testing/android-testing_ex3):
	- Create some Unit Tests for each of the 4 requirements:
		- **1.** The username/password is empty
		- **2.** The username is already taken
		- **3.** The confirmed password is not the same as the real password
		- **4.** The password contains less than 2 digits

	- Then, implement the method `validateRegistrationInput`:

		```
		object RegistrationUtil {

		    private val existingUsers = listOf("Jack", "Matthew")

		    /**
		     * The input is not valid if:
		     * 1) The username/password is empty
		     * 2) The username is already taken
		     * 3) The confirmed password is not the same as the real password
		     * 4) The password contains less than 2 digits
		     */
		    fun validateRegistrationInput(
		        username: String,
		        password: String,
		        confirmedPassword: String
		    ): Boolean {
		        // TODO
		        return true
		    }
		}
		```

## Resources

- [Unit tests](https://developer.android.com/codelabs/android-training-unit-tests#0)
- [UI tests](https://developer.android.com/codelabs/android-training-espresso-for-ui-testing#0)
- [Integration tests](https://adalpari.github.io/android-testing-integration-tests/)

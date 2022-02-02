
# Fragments lifecycles

# Topics
- Fragment lifecycle
- Learn to work on different screen sizes
- Learn how to pass arguments between fragments or between a fragment and the activity and how to store data at configuration change

## Basic Requirements

Complete exercises below

## Exercise 1. Adding XML Layout of a Fragment

- In the code below we are setting the layout of a fragment called `FragmentExample.kt`
- How can we make it simpler? Maybe, in only 1 line?

  ```
  class FragmentExample : Fragment() {

      override fun onCreateView(
          inflater: LayoutInflater,
          container: ViewGroup?,
          savedInstanceState: Bundle?
      ): View? {
          super.onCreateView(inflater, container, savedInstanceState)
          return inflater.inflate(R.layout.fragment_example, container, false)
      }
  }
  ```

### Solution

- We can apply the following source code:

  ```
  class FragmentExample : Fragment(R.layout.fragment_example) {}
  ```

## Exercise 2. Adding Fragment to a XML Layout

- In the code below we forgot to set the fragment inside the XML layout
- How can we do that? Maybe, in only 1 line?

  ```
  <?xml version="1.0" encoding="utf-8"?>
  <androidx.constraintlayout.widget.ConstraintLayout xmlns:android="http://schemas.android.com/apk/res/android"
      xmlns:app="http://schemas.android.com/apk/res-auto"
      xmlns:tools="http://schemas.android.com/tools"
      android:layout_width="match_parent"
      android:layout_height="match_parent"
      android:orientation="vertical"
      tools:context=".MainActivity">

      <androidx.fragment.app.FragmentContainerView
          android:id="@+id/fragment_container_view"
          android:layout_width="match_parent"
          android:layout_height="match_parent"
          app:layout_constraintBottom_toBottomOf="parent"
          app:layout_constraintEnd_toEndOf="parent"
          app:layout_constraintStart_toStartOf="parent"
          app:layout_constraintTop_toTopOf="parent" />
  </androidx.constraintlayout.widget.ConstraintLayout>
  ```

### Solution

- We can apply the following source code:

  ```
  <?xml version="1.0" encoding="utf-8"?>
  <androidx.constraintlayout.widget.ConstraintLayout xmlns:android="http://schemas.android.com/apk/res/android"
      xmlns:app="http://schemas.android.com/apk/res-auto"
      xmlns:tools="http://schemas.android.com/tools"
      android:layout_width="match_parent"
      android:layout_height="match_parent"
      android:orientation="vertical"
      tools:context=".MainActivity">

      <androidx.fragment.app.FragmentContainerView
          android:id="@+id/fragment_container_view"
          android:layout_width="match_parent"
          android:layout_height="match_parent"
          android:name="com.codeop.android_fragment_lifecycles.fragments.FragmentExample"       // Line added
          app:layout_constraintBottom_toBottomOf="parent"
          app:layout_constraintEnd_toEndOf="parent"
          app:layout_constraintStart_toStartOf="parent"
          app:layout_constraintTop_toTopOf="parent" />
  </androidx.constraintlayout.widget.ConstraintLayout>
  ```

## Exercise 3. Passing arguments between Activity and Fragment

- Create an app that:
  - Contains one `Activity` and one `Fragment`
  - The `Activity` must have one field: a `Button`
  - The `Fragment` must be inflated inside the `Activity`, and must have one field: a `TextView`
  - The `Fragment` must fill 90% of the `height` of the screen
  - The landscape layout of this `Fragment` must have the proportion of 80%
  - The `Activity` must pass some data to the `Fragment` when the `Button` is clicked:
    - The data must be an instance of the class `Person`:
      ```
      data class Person (
          val name: String,
          val age: Int
      )
      ```
    - After the data reach the `Fragment`, its content (the `toString()` of the `Person` passed) must be placed into the `TextView` of the `Fragment`
  - The content of this `TextView` must be preserved when the phone is rotated

### Solution

- Check the source code

## Resources

- [Fragment lifecycle](https://google-developer-training.github.io/android-developer-advanced-course-concepts/unit-1-expand-the-user-experience/lesson-1-fragments/1-2-c-fragment-lifecycle-and-communications/1-2-c-fragment-lifecycle-and-communications.html)
- [Learn to work on different screen sizes](https://developer.android.com/guide/topics/large-screens/support-different-screen-sizes)
- [Learn how to pass arguments between fragments or between a fragment and the activity and how to store date at configuration change](https://developer.android.com/guide/fragments/communicate)

## Notes

_This is a student project that was created at [CodeOp](http://CodeOp.tech), an android development bootcamp in Barcelona._

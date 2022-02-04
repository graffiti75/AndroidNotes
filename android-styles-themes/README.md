
# Style & Themes

# Topics
- Style & Themes
- Material design
- Accessibility
- Flavours in Android

## Basic Requirements

Complete exercises below

## Exercise 1. CardView and Styles

- Given the app into [this repository](https://github.com/CodeOp-tech/bumble-android-assignments/tree/master/android-styles-themes/android-styles-themes_ex1):
	- Replace the current `LinearLayoutCompat` (with "Dog 1") with a `CardView` component
	- Add two more `CardView`'s
		- Add on those two infos for `Dog 2` and `Dog 3`
		- Have you noticed what happened when we added those two `CardView`'s? Now we can't access the `Dog 3` informations!
		- How can we fix this?
	- Currently there's a low contract between the `TextView` "Dog 1" and the dog `ImageView`
		- How can we change this, adding a high contract between those two components?
		- How can we make the XML layout more modular, avoiding repetitions?

## Exercise 2. Flavors

- Imagine your company needs to create an app with two different outputs:
	- One output for the **Free** users, and another for the **Paid** users
	- Should we create 2 different apps? Is there an alternative?
	- Spend 30 minutes searching about, and create an app that:
		- Shows a simple message "Free User" (in a `TextView`) when the current user selected the "Free" option
		- Shows another simple message "Paid User" (in the same `TextView`) when the current user selected the "Paid" option
- **PS.:** The teacher will pick some student to explain about this concept to the whole class, and also to show the app created

## Exercise 3. Accessibility

- Given the app into [this repository](https://github.com/CodeOp-tech/bumble-android-assignments/tree/master/android-styles-themes/android-styles-themes_ex3):
	- How can we improve it's accessibility?

## Resources

- [Style & Themes](https://developer.android.com/guide/topics/ui/look-and-feel/themes)
- [Material design](https://material.io/design)
- [Accessibility](https://developer.android.com/codelabs/starting-android-accessibility)
- [Flavours in Android](https://developer.android.com/studio/build/build-variants)

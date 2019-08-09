# Android App v1

A app for my website: [TheSourav.Com](http://thesourav.com)

It has a **Action Bar**. Theme Color is *Default*.
### App Looks Like ⇣
<img src="https://github.com/souravm77/images/blob/master/myappv1%20(WithActionBar)%20(1).jpg" width="200">   <img src="https://github.com/souravm77/images/blob/master/myappv1%20(WithActionBar)%20(2).jpg" width="200">

## Action Bar Remove:-

It has a **action bar**. If you want to delete this just go to ```App > res > values > style.xml``` then change this line
```XML
<style name="AppTheme" parent="Theme.AppCompat.Light.DarkActionBar">
```
into
```XML
<style name="AppTheme" parent="Theme.AppCompat.Light.NoActionBar">
```
App will be fullscreen. Also you can *deleted unnecessary lines* if you wish. Just go to ```MainActivity.java``` and delete this lines only:
```java
ActionBar actionBar;
```
```java
actionBar=getSupportActionBar();
        actionBar.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#0078ff")));
        actionBar.setTitle("Welcome to Sourav's Web");
```
### After Remove Action Bar App Looks Like ⇣
<img src="https://github.com/souravm77/images/blob/master/myappv1%20(NoActionBar)%20(1).jpg" width="200">   <img src="https://github.com/souravm77/images/blob/master/myappv1%20(NoActionBar)%20(2).jpg" width="200">
## Change App Icon:-

Right click **app** then go to ```new > Image Asset```, upload your image _**(Size Should be 512x512)**_, adjust size and ```next > finish```

## With ❤️ [Sourav](http://thesourav.com)

- [ ] Sleep
- [ ] Eat
- [x] Code

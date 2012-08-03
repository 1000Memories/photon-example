# photon-example
An example [Dropwizard](http://dropwizard.codahale.com/) app that uses [photon-core](https://github.com/1000Memories/photon-core) to process [Twitter](https://twitter.com/) avatars on the fly.

----

## Example transformations

The original image  
![Original](https://photon-example.herokuapp.com/michaelfairley)

Resized to a width of 200px (`;w=200` added to the original URL)  
![200px Wide](https://photon-example.herokuapp.com/michaelfairley;w=200)

Rotated 180 degrees (`;r=180` added to the original URL)  
![Rotated 180 degrees](https://photon-example.herokuapp.com/michaelfairley;r=180)

A crop of just the face (`;c=130,60,200,200` added to the original URL)  
![Cropped closer](https://photon-example.herokuapp.com/michaelfairley;c=130,60,200,220)

Cropped to the face, rotated, then resized  
![Resized, cropped, and rotated](https://photon-example.herokuapp.com/michaelfairley;c=130,60,200,220;r=180;w=100)

----

Try it out on your own avatar: https://photon-example.herokuapp.com/{your-twitter-user-name}
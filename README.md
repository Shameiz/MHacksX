# MHacksX
# September 2017

# Inspiration
Bicycling is a great, eco-friendly way to move from place to place while also getting a great work out! However, the biking community faces several challenges we believe LertBike can solve. First, if biker falls off their bike in the middle of the woods, do emergency services hear it? We have yet to equip every tree in the forest with emergency beacons, so the answer is no. There seems to be an ongoing feud between bike riders and motorists, how can we make riding on bike lanes and roads safer and more pleasant for cars and bikers alike? Nowadays, cars are being equipped with technology for them to better accommodate cyclists, but what about something for the cyclists to better motorists? LertBike has a solution! How about listening to music when you bike? It is generally considered unsafe in the biking community to ride with earbuds because of cars and other bike riders. A bicycle rider needs to be aware of their surroundings and listen to cars or other riders that may be coming from behind. What if there was a way for cyclists to be more aware of their surroundings while also listening to music. LertBike has the answer!

# What it does
LertBike is a mobile application and sensor system that has three specific functions:

Alert loved-ones and emergency services in the instance of a biking accident.
Improve the bike-to-car relationship by reducing biker blind spots.
Increasing biking enjoyability by making music safer to listening while riding.
The LertBike System is equipped with the Bosch XDK multi-sensor which detects a crash or impact and communicates with the mobile phone over Bluetooth. The rider is then prompted to answer an alert from the application asking if they are alright. If the rider does not respond after a user-selected, pre-set time, the application will notify contacts with a pre-written message that the user has been in a crash and may need help. On the rear of the bike, near the seat tube, there is a rear facing camera which also connects to the mobile application using blue tooth. When there is a car or other cyclist approaching, the application will give a brief audio message alerting the cyclist over the music they are listening to.

# How we built it
There are three major components to the LertBike System:

Bosch XDK
twilio API
Camera/Yolo Object Detection API
LertBike is not only a mobile application, but rather an intricate system including wireless sensors, cameras, and APIs. For the mobile platform, we used Android Studio. The Bosch XDK is a sensor capable of measuring acceleration, gyroscopic movement, magnetic fields, humidity, pressure, temperature, acoustics, and light while transmitting the data wirelessly over Bluetooth. We have affixed the Bosch XDK sensor to the frame of the bike and taken preliminary data for safe riding. Bosch XDK has a proprietary Cross-Domain Development Kit built using C/C++. If a crash occurs, the twilio API is called and text messages are sent to the appropriate contacts. The rear facing camera on the seat post is used in conjunction with the Yolo Object Detection API. For the Bluetooth enabled features, the mobile application uses a Bluetooth low energy API to assist with battery life. For the server side portion of the application, Ruby is used.

# Challenges we ran into
What is a hackathon without some challenges? The biggest challenge we encountered is we bit off much more than we can chew. We started the hackathon with a great idea accomplishing three goals: improving biker safety using sensors, bettering the bike-to-car relationship with camera sensors, and increasing enjoyment of biking using music. Unfortunately, we were unable to get as far as we hoped to, but we will continue working on the project beyond the hackathon!

# Accomplishments that we're proud of
The LertBike project incorporated various hardware and software aspects which none of us had ever experimented before. One accomplishment we are very happy about is being able to effectively use the Bosch multi-sensor and XDK software to collect data pertaining to both typical bike use and simulated crashes. We were then able to connect the XDK wirelessly to a mobile phone to see the data from bike rides in real time. The LertBike System is a tool to improve safety for both bikers and motorists and we think it is an accomplishment to start building the bones of a system that could be used in the future to save time, lives, and money.

# What we learned
The "Internet of Things" and safety are what drove us to build LertBike this weekend. We got to experience firsthand what hardware and software engineers must do to develop tools that many of us take for granted. Although we thought we were going to be able to test the Bosch XDK sensor on various bikes and trails, time did not allow. If we managed to launch LertBike we would need to log hundreds, if not thousands of hours’ worth of testing. Although we did not actively use the Amazon Web Services Internet of Things Platform, it was something we thought about considering the nature of our data.

# What's next for LertBike
36 hours is nowhere near enough time to add all of the features we would love to have in LertBike System. The next step for LertBike would be to continue building the wireless sensor and app system, improve reliability, and use the Bosch XDK multi-sensors to amass data pertaining to bike usage and accidents.

In conclusion, LertBike is on its way to becoming a fantastic interconnected system of sensors, image recognition software, and alert system. We hope to increase bike safety as much as a helmet!

It's not just a bike, it's a LertBike. LertBike.com
Devpost: https://devpost.com/software/lert-bike

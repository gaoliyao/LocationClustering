# LocationClassifier
A new algorithm for location classification in java

https://medium.com/@marsgaocv/a-new-method-of-personal-location-classification-156ff8fc5c2c

A New Method Of Personal Location Clustering
## Motivation:
Location, as an important context, has widely been used to enhance the system’s intelligence in lots of applications and services. Location-based computing has been largely used in our life.
Fig1. Location-based Restaurant Recommendation System( image from yelp)As we can see, Yelp is using the current location of user to recommend restaurants around the user(Fig.1). The current location is easy to get and useful in many situation. But the machine seems to be impossible to answer the question: “where have the user been today?”. A “visited-location” list is important in many situations. For example, Yelp might give better recommendations if it is aware of the restaurants the user have been to. Not only the recommendation system, many context-aware systems might get better performance with a “visited-location” list. The Status-based Location Clustering algorithm is designed for this question and have a good performance.
Fig2. Google Map( from wikiHow)In Fig2, the algorithm should be able to extract the coordinate of Brooklyn Museum and point B from a large amount of points.
## Related Works
K-means Clustering

Fig3. Example of Location History Data (from Google)In Fig3, the red dot represents the coordinates which has been collected by smartphone every minute. We can possibly infer that the user have been stayed in two places where the red dots are pretty close to each other. For the equally distributed dots, we can also make a good guess that the user is moving to another place. K-means clustering can get the clustering center which may have a pretty good performance. But the clustering center may be affected by the other points, which means the result of the visited-location might have very bad performance. It might get some places where the user have never been to.
Fig4. The Error of K-means ClusteringStatus-based Location Clustering
Here comes the Status-based Location Clustering. This idea was first came up from Fanglin Chen, PhD student in Carnegie Mellon University. There are actually only two important status in this problem we should focus: moving and arriving. If we know that the user is moving, we can ignore those points. Once we know that the user is arriving, that will be the coordinate point that we want. So the problem can be changed to: how can we know the user is moving or arriving?
Well, the problem is pretty simple to solve with several location points collected from last few minutes. If the user is moving, the points collected a few minutes should be distributed.
Fig5. Status of MovingHowever, if the user is arriving, the points should be gradually transferred from distributed points to concentrated points.
Fig6. Status of ArrivingSo we can use a simple coordinate-time model to solve the problem.

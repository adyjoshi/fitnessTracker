iteration 2:

Senario: A user wants to check thier record for a certain activity

User case: Viewing statistics:
     main path:
	1. Default activity is selected.
	2. data is loaded from the system.
	3.System shows duration, heart rate, calorie burned, steps, average speed, location of the activity and hydration.
	4. All the activities are stored and sorted according to time, distance or speed.
	5.User can access the activity whenever.
     Alternative path:
        1. User selects an activity other than the default to track.
Implementation:
	when a user select an activity to view, the activity module comes into play. Activity module can be use to switch between various activities. The data for the activity is import from the activity detail module. The data of the activity is sorted using the data calculation modules. All these are displayed by the activity display module.

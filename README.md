
# Appointment Booking System

## Project Overview

The __Appointment Booking System__ is a simple and user-friendly web application built using __Spring Boot__ and __Thymeleaf__. It allows users to book appointments by providing their details, selecting a date, time, service type, and additional notes. The system validates the input and ensures that the appointment date is in the future. After a successful booking, users receive a confirmation displaying their appointment details.

## Key Features

- __Intuitive User Interface:__ Clean and responsive design using HTML and CSS.

- __Form Validation:__ Ensures that the appointment date is in the future.

- __Default Notes Handling:__ Displays a default message when no additional notes are provided.

- __Spring Boot Backend:__ Robust and efficient backend powered by Spring Boot MVC.

- __Dynamic Confirmation Page:__ Displays submitted appointment details after successful form submission.


## Technologies Used

- __Java__ (Spring Boot Framework)

- __Thymeleaf__ (Template Engine)

- __HTML5 & CSS3__ (Frontend Design)

- __Maven__(Build Automation)





## Folder Structure

```
appointment_booking/
│
├── src/
│   └── main/
│       ├── java/
│       │   └── com/
│       │       └── example/
│       │           └── appointment_booking/
│       │               ├── AppointmentBookingApplication.java
│       │               ├── controller/
│       │               │   └── AppointmentController.java
│       │               └── model/
│       │                   └── Appointment.java
│       └── resources/
│           ├── templates/
│           │   ├── appointmentForm.html
│           │   └── appointmentSuccess.html
│           └── static/
│               └── css/
│                   └── styles.css
│
└── pom.xml
```


## How to Run

- **Clone the repository:**
   
```git clone https://github.com/Bhajarangh/springboot-appointment-scheduler.git ```


- __Navigate to the project directory:__

``` cd springboot-appointment-scheduler```

- __Build and run the application:__

```mvn spring-boot:run ```

- __Access the application:__

Open your browser and visit ``` http://localhost:8080/appointment/form ```






## Appointment Booking Flow



__1. Fill out the form:__

- Name

- Date (Future date validation)

- Time

- Contact

- Service Type (Dropdown)

- Additional Notes (Optional, defaults to "No additional notes provided" if left blank)

__2. Submit the form.__

__3. View the confirmation page with appointment details.__
## Future Enhancements

- Add database integration for storing appointments.

- Implement email confirmation feature.

- Enhance form styling and user experience.






## License

This project is licensed under the ``` MIT License.```




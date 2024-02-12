# Bus Reservation System

## Overview

This project implements a simple bus reservation system that allows users to book seats by providing necessary details. The system is designed to interact with a database using JDBC for storing and retrieving booking information.

## User Interaction

To initiate the bus reservation process, the user is prompted to enter either '1' to continue or '2' to cancel the operation.

## Required Details

The system requests the following details from the user:

1. Username
2. Bus number
3. Travel date

These details are then stored in a database using JDBC. The system ensures that the data is only stored upon successful booking, and it checks the bus capacity availability for the specified date.

## Database Interaction

Data retrieval from the database is implemented whenever a user provides details. This step is crucial to verify the current bus capacity and facilitate the booking process.

## Modular Code Structure

The project employs a modular code structure with separate classes for various functionalities. This approach aids in future updates and simplifies debugging processes.

## Configuration Alerts

Users need to pay attention to the following alerts:

1. Check the localhost URL based on your database setup.
2. Update the 'username' and 'password' as required.
3. Ensure that the JDBC driver is present in your project folder for proper database connectivity.

Feel free to contribute, report issues, or suggest improvements!


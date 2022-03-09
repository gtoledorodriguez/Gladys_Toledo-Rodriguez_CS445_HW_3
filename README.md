# Gladys_Toledo-Rodriguez_CS445_HW_3
## Build and run instructions
To build and run using the Makefile, first navigate to the project folder and then run the app by typing the following simple command in the terminal:

    make

To run unit tests and view results and coverage in your browser, type the following command in terminal:

    make test

If this does not work you may need to install the xdg-utils package:

    sudo apt-get install -y xdg-utils

Finally, if an error occurs and you wish to start from a clean slate, reset gradle with the following command:

    make clean

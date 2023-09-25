package exercise2;

  /* Provide Implementation for the diagram below. Then create a test class
in which you need to create Objects of ChromeDriver, FirefoxDrive and SafariDriver classes and see
which methods available to them.
   */

    class T13 {
        // Parent interface
        interface WebDriver {
            void open();

            void close();

            String getTitle();
        }

        // Child interface
        interface RemoteWebDriver extends WebDriver {
            void navigate();
        }

        // Sibling interface
        interface TakesScreenshot {
            void getScreenshothot();
        }

        // Grandchild classes
        class ChromeDriver implements RemoteWebDriver, TakesScreenshot {
            @Override
            public void open() {
                System.out.println("Opening Chrome");
            }

            @Override
            public void close() {
                System.out.println("Closing Chrome");
            }

            @Override
            public String getTitle() {
                return "Chrome Page Title";
            }

            @Override
            public void navigate() {
                System.out.println("Navigating to a new page in Chrome");
            }

            @Override
            public void getScreenshothot() {
                System.out.println("Taking a screenshot in Chrome");
            }
        }

        class FirefoxDriver implements RemoteWebDriver, TakesScreenshot {
            @Override
            public void open() {
                System.out.println("Opening Firefox");
            }

            @Override
            public void close() {
                System.out.println("Closing Firefox");
            }

            @Override
            public String getTitle() {
                return "Firefox Page Title";
            }

            @Override
            public void navigate() {
                System.out.println("Navigating to a new page in Firefox");
            }

            @Override
            public void getScreenshothot() {
                System.out.println("Taking a screenshot in Firefox");
            }
        }

        class SafariDriver implements RemoteWebDriver, TakesScreenshot {
            @Override
            public void open() {
                System.out.println("Opening Safari");
            }

            @Override
            public void close() {
                System.out.println("Closing Safari");
            }

            @Override
            public String getTitle() {
                return "Safari Page Title";
            }

            @Override
            public void navigate() {
                System.out.println("Navigating to a new page in Safari");
            }

            @Override
            public void getScreenshothot() {
                System.out.println("Taking a screenshot in Safari");
            }
        }

        public static void main(String[] args) {
            T13 t13 = new T13();

            RemoteWebDriver chromeDriver = t13.new ChromeDriver();
            RemoteWebDriver firefoxDriver = t13.new FirefoxDriver();
            RemoteWebDriver safariDriver = t13.new SafariDriver();

            chromeDriver.open();
            chromeDriver.navigate();
            System.out.println("Chrome Page Title: " + chromeDriver.getTitle());
            chromeDriver.close();
            ((TakesScreenshot) chromeDriver).getScreenshothot();

            firefoxDriver.open();
            firefoxDriver.navigate();
            System.out.println("Firefox Page Title: " + firefoxDriver.getTitle());
            firefoxDriver.close();
            ((TakesScreenshot) firefoxDriver).getScreenshothot();


            safariDriver.open();
            safariDriver.navigate();
            System.out.println("Safari Page Title: " + safariDriver.getTitle());
            safariDriver.close();
            ((TakesScreenshot) safariDriver).getScreenshothot();
        }
    }





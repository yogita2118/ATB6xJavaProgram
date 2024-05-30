package may.ex_25052024;

public enum PAGES {



        HOME("https://app.vwo.com/","homePage"),
        LOGIN("https://app.vwo.com/#login","loginPage"),
        DASHBOARD("https://app.vwo.com/dashboard","dashPage");

        String url;
        String page;
        // Home ->
        // Login -> https://app.vwo.com/login
        // Dashboard -> https://app.vwo.com/dasbhoard


        void PAGES(String url, String page) {
            this.url = url;
            this.page = page;
        }

    PAGES(String url, String homePage) {

    }

    public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public String getPage() {
            return page;
        }

        public void setPage(String page) {
            this.page = page;
        }
}

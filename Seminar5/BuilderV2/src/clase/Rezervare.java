package clase;




    public class Rezervare {
        private boolean areMancare;
        private boolean areScaunErgonomic;
        private boolean areBautura;
        private boolean areMuzica;
        private String genMuzical;

        protected Rezervare() {
            this.areMancare = false;
            this.areScaunErgonomic = false;
            this.areBautura = false;
            this.areMuzica = false;
            this.genMuzical=null;
        }

        protected Rezervare(boolean areMancare, boolean areScaunErgonomic, boolean areBautura, boolean areMuzica, String genMuzical) {
            this.areMancare = areMancare;
            this.areScaunErgonomic = areScaunErgonomic;
            this.areBautura = areBautura;
            this.areMuzica = areMuzica;
            this.genMuzical = genMuzical;
        }

        public static class BuiderRezervare implements AbstractBuilder{
            private boolean areMancare;
            private boolean areScaunErgonomic;
            private boolean areBautura;
            private boolean areMuzica;
            private String genMuzical;

            @Override
            public Rezervare build() {
                Rezervare rezervare=new Rezervare(areMancare,areScaunErgonomic,areBautura,areMuzica,genMuzical);
                return rezervare;
            }

            @Override
            public AbstractBuilder adaugaScaunErgonomic() {
                this.areScaunErgonomic=true;
                return this;
            }

            @Override
            public AbstractBuilder adaugaBautura() {
                this.areBautura=true;
                return this;
            }

            @Override
            public AbstractBuilder adaugaMuzica() {
                this.areMuzica=true;
                return this;
            }

            @Override
            public AbstractBuilder adaugaMancare() {
                this.areMancare=true;
                return this;
            }

            @Override
            public AbstractBuilder adaugaGenMuzical(String genMuzical) {
                this.areMuzica=true;
                this.genMuzical=genMuzical;
                return this;
            }
        }
        protected boolean isAreMancare() {
            return areMancare;
        }

        protected void setAreMancare(boolean areMancare) {
            this.areMancare = areMancare;
        }

        protected boolean isAreScaunErgonomic() {
            return areScaunErgonomic;
        }

        protected void setAreScaunErgonomic(boolean areScaunErgonomic) {
            this.areScaunErgonomic = areScaunErgonomic;
        }

        protected boolean isAreBautura() {
            return areBautura;
        }

        protected void setAreBautura(boolean areBautura) {
            this.areBautura = areBautura;
        }

        protected boolean isAreMuzica() {
            return areMuzica;
        }

        protected void setAreMuzica(boolean areMuzica) {
            this.areMuzica = areMuzica;
        }

        protected String getGenMuzical() {
            return genMuzical;
        }

        protected void setGenMuzical(String genMuzical) {
            this.genMuzical = genMuzical;
        }

        @Override
        public String toString() {
            return "Rezervare{" +
                    "areMancare=" + areMancare +
                    ", areScaunErgonomic=" + areScaunErgonomic +
                    ", areBautura=" + areBautura +
                    ", areMuzica=" + areMuzica +
                    ", genMuzical='" + genMuzical + '\'' +
                    '}';
        }
    }



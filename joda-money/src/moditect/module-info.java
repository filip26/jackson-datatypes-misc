
// Generated 27-Mar-2019 using Moditect maven plugin
module com.fasterxml.jackson.datatype.joda {
    requires com.fasterxml.jackson.annotation;
    requires com.fasterxml.jackson.core;
    requires com.fasterxml.jackson.databind;
    requires joda.money;

    exports com.fasterxml.jackson.datatype.jodamoney;

    provides com.fasterxml.jackson.databind.Module with
        com.fasterxml.jackson.datatype.jodamoney.JodaMoneyModule;
}

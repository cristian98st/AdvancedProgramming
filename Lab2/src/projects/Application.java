package projects;

import enums.Language;

import java.time.LocalDate;
/** @author Cristian and Cristina */
public class Application extends Project {
    public Language language;

    /** The constructor for an Application object */
    public Application(String name, LocalDate deadline, Language language) {
        this.name = name;
        this.deadline = deadline;
        this.language = language;
    }

    // Getters


    @Override
    public LocalDate getDeadline() {
        return super.getDeadline();
    }

    @Override
    public String getName() {
        return super.getName();
    }

    public Language getLanguage() {
        return language;
    }


    @Override
    public void setDeadline(LocalDate deadline) {
        super.setDeadline(deadline);
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    public void setLanguage(Language language) {
        this.language = language;
    }

    /** Overridden toString */

    @Override
    public String toString() {
        return name;
    }
}

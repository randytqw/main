/* @@author thamsimun */
package seedu.address.model;

import java.awt.image.BufferedImage;
import java.util.List;

import seedu.address.logic.commands.Command;
import seedu.address.model.image.Image;

/**
 * The API of the CurrentEdit component.
 */
public interface CurrentEdit {

    void saveAsTemp(Image image);

    void saveAsOriginal(Image image);

    void saveIntoTempFolder(String filename, Image image);

    Image getTempImage();

    void setTempImage();

    void updateTempImage(com.sksamuel.scrimage.Image image);

    void updateTempImage(BufferedImage image);

    void setOriginalImage(Image image);

    void displayTempImage();

    void addCommand(Command command);

    void replaceTempWithOriginal();

    boolean canUndoTemp();

    boolean canRedoTemp();

    List<Command> getTempSubHistory();

    String[] getFileNames();

    String saveToAssets(String name);
}

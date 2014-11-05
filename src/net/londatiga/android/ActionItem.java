package net.londatiga.android;

import android.content.Context;
import android.graphics.drawable.Drawable;

/**
 * Action item, displayed as menu with icon and text.
 *
 * @author Lorensius. W. L. T <lorenz@londatiga.net>
 *         <p/>
 *         Contributors:
 *         - Kevin Peck <kevinwpeck@gmail.com>
 */
public class ActionItem {
    private Drawable icon;
    private String title;
    private int actionId = -1;
    private boolean selected;
    private boolean sticky;


    /**
     * Constructor
     *
     * @param actionId Action id of the item
     * @param title    Text to show for the item
     */
    public ActionItem(int actionId, String title) {
        this(actionId, title, null);
    }

    /**
     * Constructor
     *
     * @param actionId Action id for case statements
     * @param title    Title
     * @param icon     Icon to use
     */
    public ActionItem(int actionId, String title, Drawable icon) {
        this.title = title;
        this.icon = icon;
        this.actionId = actionId;
    }

    /**
     * Constructor
     *
     * @param context    Application context
     * @param actionId   Action id for case statements
     * @param titleResId Title Resource ID
     */
    public ActionItem(Context context, int actionId, int titleResId) {
        this.title = context.getResources().getString(titleResId);
        this.icon = null;
        this.actionId = actionId;
    }

    /**
     * Constructor
     *
     * @param context    Application context
     * @param actionId   Action id for case statements
     * @param titleResId Title Resource ID
     * @param iconResId  Icon Resource ID
     */
    public ActionItem(Context context, int actionId, int titleResId, int iconResId) {
        this.title = context.getResources().getString(titleResId);
        this.icon = context.getResources().getDrawable(iconResId);
        this.actionId = actionId;
    }

    /**
     * Constructor
     *
     * @param context   Application context
     * @param actionId  Action id for case statements
     * @param title     Title
     * @param iconResId Icon Resource ID
     */
    public ActionItem(Context context, int actionId, String title, int iconResId) {
        this.title = title;
        this.icon = context.getResources().getDrawable(iconResId);
        this.actionId = actionId;
    }

    /**
     * Constructor
     *
     * @param context    Application context
     * @param actionId   Action id for case statements
     * @param titleResId Title Resource ID
     * @param icon       Icon
     */
    public ActionItem(Context context, int actionId, int titleResId, Drawable icon) {
        this.title = context.getResources().getString(titleResId);
        this.icon = icon;
        this.actionId = actionId;
    }

    /**
     * Get action title
     *
     * @return action title
     */
    public String getTitle() {
        return this.title;
    }

    /**
     * Set action title
     *
     * @param title action title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Get action icon
     *
     * @return {@link Drawable} action icon
     */
    public Drawable getIcon() {
        return this.icon;
    }

    /**
     * Set action icon
     *
     * @param icon {@link Drawable} action icon
     */
    public void setIcon(Drawable icon) {
        this.icon = icon;
    }

    /**
     * @return Our action id
     */
    public int getActionId() {
        return actionId;
    }

    /**
     * Set action id
     *
     * @param actionId Action id for this action
     */
    public void setActionId(int actionId) {
        this.actionId = actionId;
    }

    /**
     * @return true if button is sticky, menu stays visible after press
     */
    public boolean isSticky() {
        return sticky;
    }

    /**
     * Set sticky status of button
     *
     * @param sticky true for sticky, pop up sends event but does not disappear
     */
    public void setSticky(boolean sticky) {
        this.sticky = sticky;
    }

    /**
     * Check if item is selected
     *
     * @return true or false
     */
    public boolean isSelected() {
        return this.selected;
    }

    /**
     * Set selected flag;
     *
     * @param selected Flag to indicate the item is selected
     */
    public void setSelected(boolean selected) {
        this.selected = selected;
    }

}
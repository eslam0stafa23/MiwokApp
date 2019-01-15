package com.example.android.miwokapp;

/**
 * {@link Word} represents a vocabulary word that the user wants to learn.
 * It contains resource IDs for the default translation, Miwok translation, audio file, and
 * optional image file for that word.
 */

public class Word {

    //Constant value that represents no image was provided for this word
    private static final int NO_IMAGE_PROVIDED = -1;

    //String resource ID for the default translation of the word
    private String mDefaultTranslation;

    //String resource ID for the Miwok translation of the word
    private String mMiwokTranslation;

    //Image resource ID for the word
    private int mImageResId = NO_IMAGE_PROVIDED;

    //Audio resource ID for the word
    private int mAudioResId;


    /**
     * Create a new Word object.
     *
     * @param defaultTranslation is the string resource ID for the word in a language that the
     *                             user is already familiar with (such as English)
     * @param miwokTranslation is the string resource Id for the word in the Miwok language
     * @param imageResId the drawable resource ID for the image associated with the word
     * @param audioResId is the resource ID for the audio file associated with this word
     */
    public Word(String defaultTranslation, String miwokTranslation, int audioResId, int imageResId) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mAudioResId = audioResId;
        mImageResId = imageResId;
    }


    /**
     * Create a new Word object.
     *
     * @param defaultTranslation is the string resource ID for the word in a language that the
     *                           user is already familiar with (such as English)
     * @param miwokTranslation   is the word in the Miwok language
     * @param audioResId         is the resource ID for the audio file associated with this word
     */
    public Word(String defaultTranslation, String miwokTranslation, int audioResId) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mAudioResId = audioResId;
    }

    /**
     * Get the default translation of the word.
     */
    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }


    /**
     * Get the Miwok translation of the word.
     */
    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }


    /**
     * Return the audio resource ID of the word.
     */
    public int getAudioResId() {
        return mAudioResId;
    }


    /**
     * Return the image resource ID of the word.
     */
    public int getImageResId() {
        return mImageResId;
    }


    /**
     * Returns whether or not there is an image for this word.
     */
    public boolean hasImage() {
        return mImageResId != NO_IMAGE_PROVIDED;
    }


}
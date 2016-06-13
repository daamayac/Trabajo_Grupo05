package ec.edu.uce.trabajo_grupo05.ejercicios.c1;

public class E09SectionItem<T> {
    private String mTitle;
    private T[] mItems;

    public E09SectionItem(String title, T[] items) {
        if (title == null) title = "";

        mTitle = title;
        mItems = items;
    }

    public String getTitle() {
        return mTitle;
    }

    public T getItem(int position) {
        return mItems[position];
    }

    public int getCount() {
        //Include an additional item for the section header
        return (mItems == null ? 1 : 1 + mItems.length);
    }

    @Override
    public boolean equals(Object object) {
        //Two sections are equal if they have the same title
        if (object != null && object instanceof E09SectionItem) {
            return ((E09SectionItem) object).getTitle().equals(mTitle);
        }

        return false;
    }
}

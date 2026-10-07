package s4;

import android.os.Parcel;
import android.os.Parcelable;
import java.text.Collator;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements Comparable, Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new r4.a(3);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Collator f8389a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Locale f8390b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f8391c;

    public a(int i, Locale locale) {
        Collator collator = Collator.getInstance(Locale.getDefault());
        this.f8389a = collator;
        collator.setStrength(0);
        this.f8390b = locale;
        this.f8391c = i;
    }

    public static String a(Locale locale) {
        String country = locale.getCountry();
        return new String(Character.toChars(Character.codePointAt(country, 0) - (-127397))).concat(new String(Character.toChars(Character.codePointAt(country, 1) - (-127397))));
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        Locale locale = Locale.getDefault();
        return this.f8389a.compare(this.f8390b.getDisplayCountry().toUpperCase(locale), ((a) obj).f8390b.getDisplayCountry().toUpperCase(locale));
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        Locale locale;
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            Locale locale2 = aVar.f8390b;
            if (this.f8391c == aVar.f8391c && ((locale = this.f8390b) == null ? locale2 == null : locale.equals(locale2))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Locale locale = this.f8390b;
        return ((locale != null ? locale.hashCode() : 0) * 31) + this.f8391c;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        Locale locale = this.f8390b;
        sb2.append(a(locale));
        sb2.append(" ");
        sb2.append(locale.getDisplayCountry());
        sb2.append(" +");
        sb2.append(this.f8391c);
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeSerializable(this.f8390b);
        parcel.writeInt(this.f8391c);
    }

    public a(Parcel parcel) {
        Collator collator = Collator.getInstance(Locale.getDefault());
        this.f8389a = collator;
        collator.setStrength(0);
        this.f8390b = (Locale) parcel.readSerializable();
        this.f8391c = parcel.readInt();
    }
}

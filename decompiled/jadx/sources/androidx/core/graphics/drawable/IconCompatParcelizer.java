package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Parcel;
import android.os.Parcelable;
import java.nio.charset.Charset;
import o2.a;
import o2.b;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public class IconCompatParcelizer {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static IconCompat read(a aVar) {
        IconCompat iconCompat = new IconCompat();
        iconCompat.f585a = aVar.f(iconCompat.f585a, 1);
        byte[] bArr = iconCompat.f587c;
        if (aVar.e(2)) {
            Parcel parcel = ((b) aVar).e;
            int i = parcel.readInt();
            if (i < 0) {
                bArr = null;
            } else {
                byte[] bArr2 = new byte[i];
                parcel.readByteArray(bArr2);
                bArr = bArr2;
            }
        }
        iconCompat.f587c = bArr;
        iconCompat.f588d = aVar.g(iconCompat.f588d, 3);
        iconCompat.e = aVar.f(iconCompat.e, 4);
        iconCompat.f589f = aVar.f(iconCompat.f589f, 5);
        iconCompat.f590g = (ColorStateList) aVar.g(iconCompat.f590g, 6);
        String string = iconCompat.i;
        if (aVar.e(7)) {
            string = ((b) aVar).e.readString();
        }
        iconCompat.i = string;
        String string2 = iconCompat.f591j;
        if (aVar.e(8)) {
            string2 = ((b) aVar).e.readString();
        }
        iconCompat.f591j = string2;
        iconCompat.h = PorterDuff.Mode.valueOf(iconCompat.i);
        switch (iconCompat.f585a) {
            case -1:
                Parcelable parcelable = iconCompat.f588d;
                if (parcelable == null) {
                    throw new IllegalArgumentException("Invalid icon");
                }
                iconCompat.f586b = parcelable;
                return iconCompat;
            case 0:
            default:
                return iconCompat;
            case 1:
            case 5:
                Parcelable parcelable2 = iconCompat.f588d;
                if (parcelable2 != null) {
                    iconCompat.f586b = parcelable2;
                    return iconCompat;
                }
                byte[] bArr3 = iconCompat.f587c;
                iconCompat.f586b = bArr3;
                iconCompat.f585a = 3;
                iconCompat.e = 0;
                iconCompat.f589f = bArr3.length;
                return iconCompat;
            case 2:
            case 4:
            case 6:
                String str = new String(iconCompat.f587c, Charset.forName("UTF-16"));
                iconCompat.f586b = str;
                if (iconCompat.f585a == 2 && iconCompat.f591j == null) {
                    iconCompat.f591j = str.split(":", -1)[0];
                }
                return iconCompat;
            case 3:
                iconCompat.f586b = iconCompat.f587c;
                return iconCompat;
        }
    }

    public static void write(IconCompat iconCompat, a aVar) {
        aVar.getClass();
        iconCompat.i = iconCompat.h.name();
        switch (iconCompat.f585a) {
            case -1:
                iconCompat.f588d = (Parcelable) iconCompat.f586b;
                break;
            case 1:
            case 5:
                iconCompat.f588d = (Parcelable) iconCompat.f586b;
                break;
            case 2:
                iconCompat.f587c = ((String) iconCompat.f586b).getBytes(Charset.forName("UTF-16"));
                break;
            case 3:
                iconCompat.f587c = (byte[]) iconCompat.f586b;
                break;
            case 4:
            case 6:
                iconCompat.f587c = iconCompat.f586b.toString().getBytes(Charset.forName("UTF-16"));
                break;
        }
        int i = iconCompat.f585a;
        if (-1 != i) {
            aVar.j(i, 1);
        }
        byte[] bArr = iconCompat.f587c;
        if (bArr != null) {
            aVar.i(2);
            Parcel parcel = ((b) aVar).e;
            parcel.writeInt(bArr.length);
            parcel.writeByteArray(bArr);
        }
        Parcelable parcelable = iconCompat.f588d;
        if (parcelable != null) {
            aVar.i(3);
            ((b) aVar).e.writeParcelable(parcelable, 0);
        }
        int i10 = iconCompat.e;
        if (i10 != 0) {
            aVar.j(i10, 4);
        }
        int i11 = iconCompat.f589f;
        if (i11 != 0) {
            aVar.j(i11, 5);
        }
        ColorStateList colorStateList = iconCompat.f590g;
        if (colorStateList != null) {
            aVar.i(6);
            ((b) aVar).e.writeParcelable(colorStateList, 0);
        }
        String str = iconCompat.i;
        if (str != null) {
            aVar.i(7);
            ((b) aVar).e.writeString(str);
        }
        String str2 = iconCompat.f591j;
        if (str2 != null) {
            aVar.i(8);
            ((b) aVar).e.writeString(str2);
        }
    }
}

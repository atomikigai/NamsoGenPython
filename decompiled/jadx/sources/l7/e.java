package l7;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class e implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iS = com.bumptech.glide.c.S(parcel);
        String strI = null;
        String strI2 = null;
        k7.b bVar = null;
        int iJ = 0;
        int iJ2 = 0;
        boolean zE = false;
        int iJ3 = 0;
        boolean zE2 = false;
        int iJ4 = 0;
        while (parcel.dataPosition() < iS) {
            int i = parcel.readInt();
            switch ((char) i) {
                case 1:
                    iJ = com.bumptech.glide.c.J(i, parcel);
                    break;
                case 2:
                    iJ2 = com.bumptech.glide.c.J(i, parcel);
                    break;
                case 3:
                    zE = com.bumptech.glide.c.E(i, parcel);
                    break;
                case 4:
                    iJ3 = com.bumptech.glide.c.J(i, parcel);
                    break;
                case 5:
                    zE2 = com.bumptech.glide.c.E(i, parcel);
                    break;
                case 6:
                    strI = com.bumptech.glide.c.i(i, parcel);
                    break;
                case 7:
                    iJ4 = com.bumptech.glide.c.J(i, parcel);
                    break;
                case '\b':
                    strI2 = com.bumptech.glide.c.i(i, parcel);
                    break;
                case '\t':
                    bVar = (k7.b) com.bumptech.glide.c.h(parcel, i, k7.b.CREATOR);
                    break;
                default:
                    com.bumptech.glide.c.R(i, parcel);
                    break;
            }
        }
        com.bumptech.glide.c.n(iS, parcel);
        return new a(iJ, iJ2, zE, iJ3, zE2, strI, iJ4, strI2, bVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new a[i];
    }
}

package a7;

import a7.n;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import android.support.v4.media.MediaBrowserCompat$MediaItem;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.RatingCompat;
import android.support.v4.media.session.MediaSessionCompat$QueueItem;
import android.support.v4.media.session.MediaSessionCompat$ResultReceiverWrapper;
import android.support.v4.media.session.MediaSessionCompat$Token;
import android.support.v4.media.session.ParcelableVolumeInfo;
import android.support.v4.media.session.PlaybackStateCompat;
import androidx.fragment.app.f0;
import androidx.fragment.app.j0;
import androidx.fragment.app.m0;
import com.google.android.gms.auth.api.identity.SaveAccountLinkingTokenRequest;
import com.google.android.gms.internal.ads.zzbbs;
import java.util.ArrayList;
import u7.x;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class n implements Parcelable.Creator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f242a;

    public /* synthetic */ n(int i) {
        this.f242a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(final Parcel parcel) {
        Uri mediaUri;
        Bundle bundle;
        switch (this.f242a) {
            case 0:
                int iS = com.bumptech.glide.c.S(parcel);
                d dVar = null;
                a aVar = null;
                String strI = null;
                c cVar = null;
                b bVar = null;
                boolean zE = false;
                int iJ = 0;
                while (parcel.dataPosition() < iS) {
                    int i = parcel.readInt();
                    switch ((char) i) {
                        case 1:
                            dVar = (d) com.bumptech.glide.c.h(parcel, i, d.CREATOR);
                            break;
                        case 2:
                            aVar = (a) com.bumptech.glide.c.h(parcel, i, a.CREATOR);
                            break;
                        case 3:
                            strI = com.bumptech.glide.c.i(i, parcel);
                            break;
                        case 4:
                            zE = com.bumptech.glide.c.E(i, parcel);
                            break;
                        case 5:
                            iJ = com.bumptech.glide.c.J(i, parcel);
                            break;
                        case 6:
                            cVar = (c) com.bumptech.glide.c.h(parcel, i, c.CREATOR);
                            break;
                        case 7:
                            bVar = (b) com.bumptech.glide.c.h(parcel, i, b.CREATOR);
                            break;
                        default:
                            com.bumptech.glide.c.R(i, parcel);
                            break;
                    }
                }
                com.bumptech.glide.c.n(iS, parcel);
                return new e(dVar, aVar, strI, zE, iJ, cVar, bVar);
            case 1:
                int iS2 = com.bumptech.glide.c.S(parcel);
                PendingIntent pendingIntent = null;
                while (parcel.dataPosition() < iS2) {
                    int i10 = parcel.readInt();
                    if (((char) i10) != 1) {
                        com.bumptech.glide.c.R(i10, parcel);
                    } else {
                        pendingIntent = (PendingIntent) com.bumptech.glide.c.h(parcel, i10, PendingIntent.CREATOR);
                    }
                }
                com.bumptech.glide.c.n(iS2, parcel);
                return new f(pendingIntent);
            case 2:
                int iS3 = com.bumptech.glide.c.S(parcel);
                int iJ2 = 0;
                while (parcel.dataPosition() < iS3) {
                    int i11 = parcel.readInt();
                    if (((char) i11) != 1) {
                        com.bumptech.glide.c.R(i11, parcel);
                    } else {
                        iJ2 = com.bumptech.glide.c.J(i11, parcel);
                    }
                }
                com.bumptech.glide.c.n(iS3, parcel);
                return new g(iJ2);
            case 3:
                int iS4 = com.bumptech.glide.c.S(parcel);
                boolean zE2 = false;
                int iJ3 = 0;
                String strI2 = null;
                String strI3 = null;
                String strI4 = null;
                String strI5 = null;
                while (parcel.dataPosition() < iS4) {
                    int i12 = parcel.readInt();
                    switch ((char) i12) {
                        case 1:
                            strI2 = com.bumptech.glide.c.i(i12, parcel);
                            break;
                        case 2:
                            strI3 = com.bumptech.glide.c.i(i12, parcel);
                            break;
                        case 3:
                            strI4 = com.bumptech.glide.c.i(i12, parcel);
                            break;
                        case 4:
                            strI5 = com.bumptech.glide.c.i(i12, parcel);
                            break;
                        case 5:
                            zE2 = com.bumptech.glide.c.E(i12, parcel);
                            break;
                        case 6:
                            iJ3 = com.bumptech.glide.c.J(i12, parcel);
                            break;
                        default:
                            com.bumptech.glide.c.R(i12, parcel);
                            break;
                    }
                }
                com.bumptech.glide.c.n(iS4, parcel);
                return new h(strI2, strI3, strI4, strI5, zE2, iJ3);
            case 4:
                int iS5 = com.bumptech.glide.c.S(parcel);
                boolean zE3 = false;
                boolean zE4 = false;
                boolean zE5 = false;
                String strI6 = null;
                String strI7 = null;
                String strI8 = null;
                ArrayList arrayListK = null;
                while (parcel.dataPosition() < iS5) {
                    int i13 = parcel.readInt();
                    switch ((char) i13) {
                        case 1:
                            zE3 = com.bumptech.glide.c.E(i13, parcel);
                            break;
                        case 2:
                            strI6 = com.bumptech.glide.c.i(i13, parcel);
                            break;
                        case 3:
                            strI7 = com.bumptech.glide.c.i(i13, parcel);
                            break;
                        case 4:
                            zE4 = com.bumptech.glide.c.E(i13, parcel);
                            break;
                        case 5:
                            strI8 = com.bumptech.glide.c.i(i13, parcel);
                            break;
                        case 6:
                            arrayListK = com.bumptech.glide.c.k(i13, parcel);
                            break;
                        case 7:
                            zE5 = com.bumptech.glide.c.E(i13, parcel);
                            break;
                        default:
                            com.bumptech.glide.c.R(i13, parcel);
                            break;
                    }
                }
                com.bumptech.glide.c.n(iS5, parcel);
                return new a(zE3, strI6, strI7, zE4, strI8, arrayListK, zE5);
            case 5:
                int iS6 = com.bumptech.glide.c.S(parcel);
                String strI9 = null;
                boolean zE6 = false;
                while (parcel.dataPosition() < iS6) {
                    int i14 = parcel.readInt();
                    char c10 = (char) i14;
                    if (c10 == 1) {
                        zE6 = com.bumptech.glide.c.E(i14, parcel);
                    } else if (c10 != 2) {
                        com.bumptech.glide.c.R(i14, parcel);
                    } else {
                        strI9 = com.bumptech.glide.c.i(i14, parcel);
                    }
                }
                com.bumptech.glide.c.n(iS6, parcel);
                return new b(strI9, zE6);
            case 6:
                int iS7 = com.bumptech.glide.c.S(parcel);
                byte[] bArrF = null;
                boolean zE7 = false;
                String strI10 = null;
                while (parcel.dataPosition() < iS7) {
                    int i15 = parcel.readInt();
                    char c11 = (char) i15;
                    if (c11 == 1) {
                        zE7 = com.bumptech.glide.c.E(i15, parcel);
                    } else if (c11 == 2) {
                        bArrF = com.bumptech.glide.c.f(i15, parcel);
                    } else if (c11 != 3) {
                        com.bumptech.glide.c.R(i15, parcel);
                    } else {
                        strI10 = com.bumptech.glide.c.i(i15, parcel);
                    }
                }
                com.bumptech.glide.c.n(iS7, parcel);
                return new c(bArrF, strI10, zE7);
            case 7:
                int iS8 = com.bumptech.glide.c.S(parcel);
                boolean zE8 = false;
                while (parcel.dataPosition() < iS8) {
                    int i16 = parcel.readInt();
                    if (((char) i16) != 1) {
                        com.bumptech.glide.c.R(i16, parcel);
                    } else {
                        zE8 = com.bumptech.glide.c.E(i16, parcel);
                    }
                }
                com.bumptech.glide.c.n(iS8, parcel);
                return new d(zE8);
            case 8:
                int iS9 = com.bumptech.glide.c.S(parcel);
                int iJ4 = 0;
                PendingIntent pendingIntent2 = null;
                String strI11 = null;
                String strI12 = null;
                ArrayList arrayListK2 = null;
                String strI13 = null;
                while (parcel.dataPosition() < iS9) {
                    int i17 = parcel.readInt();
                    switch ((char) i17) {
                        case 1:
                            pendingIntent2 = (PendingIntent) com.bumptech.glide.c.h(parcel, i17, PendingIntent.CREATOR);
                            break;
                        case 2:
                            strI11 = com.bumptech.glide.c.i(i17, parcel);
                            break;
                        case 3:
                            strI12 = com.bumptech.glide.c.i(i17, parcel);
                            break;
                        case 4:
                            arrayListK2 = com.bumptech.glide.c.k(i17, parcel);
                            break;
                        case 5:
                            strI13 = com.bumptech.glide.c.i(i17, parcel);
                            break;
                        case 6:
                            iJ4 = com.bumptech.glide.c.J(i17, parcel);
                            break;
                        default:
                            com.bumptech.glide.c.R(i17, parcel);
                            break;
                    }
                }
                com.bumptech.glide.c.n(iS9, parcel);
                return new SaveAccountLinkingTokenRequest(pendingIntent2, strI11, strI12, arrayListK2, strI13, iJ4);
            case 9:
                int iS10 = com.bumptech.glide.c.S(parcel);
                PendingIntent pendingIntent3 = null;
                while (parcel.dataPosition() < iS10) {
                    int i18 = parcel.readInt();
                    if (((char) i18) != 1) {
                        com.bumptech.glide.c.R(i18, parcel);
                    } else {
                        pendingIntent3 = (PendingIntent) com.bumptech.glide.c.h(parcel, i18, PendingIntent.CREATOR);
                    }
                }
                com.bumptech.glide.c.n(iS10, parcel);
                return new i(pendingIntent3);
            case 10:
                int iS11 = com.bumptech.glide.c.S(parcel);
                int iJ5 = 0;
                m mVar = null;
                String strI14 = null;
                while (parcel.dataPosition() < iS11) {
                    int i19 = parcel.readInt();
                    char c12 = (char) i19;
                    if (c12 == 1) {
                        mVar = (m) com.bumptech.glide.c.h(parcel, i19, m.CREATOR);
                    } else if (c12 == 2) {
                        strI14 = com.bumptech.glide.c.i(i19, parcel);
                    } else if (c12 != 3) {
                        com.bumptech.glide.c.R(i19, parcel);
                    } else {
                        iJ5 = com.bumptech.glide.c.J(i19, parcel);
                    }
                }
                com.bumptech.glide.c.n(iS11, parcel);
                return new j(mVar, strI14, iJ5);
            case 11:
                int iS12 = com.bumptech.glide.c.S(parcel);
                PendingIntent pendingIntent4 = null;
                while (parcel.dataPosition() < iS12) {
                    int i20 = parcel.readInt();
                    if (((char) i20) != 1) {
                        com.bumptech.glide.c.R(i20, parcel);
                    } else {
                        pendingIntent4 = (PendingIntent) com.bumptech.glide.c.h(parcel, i20, PendingIntent.CREATOR);
                    }
                }
                com.bumptech.glide.c.n(iS12, parcel);
                return new k(pendingIntent4);
            case 12:
                int iS13 = com.bumptech.glide.c.S(parcel);
                String strI15 = null;
                String strI16 = null;
                String strI17 = null;
                String strI18 = null;
                Uri uri = null;
                String strI19 = null;
                String strI20 = null;
                String strI21 = null;
                x xVar = null;
                while (parcel.dataPosition() < iS13) {
                    int i21 = parcel.readInt();
                    switch ((char) i21) {
                        case 1:
                            strI15 = com.bumptech.glide.c.i(i21, parcel);
                            break;
                        case 2:
                            strI16 = com.bumptech.glide.c.i(i21, parcel);
                            break;
                        case 3:
                            strI17 = com.bumptech.glide.c.i(i21, parcel);
                            break;
                        case 4:
                            strI18 = com.bumptech.glide.c.i(i21, parcel);
                            break;
                        case 5:
                            uri = (Uri) com.bumptech.glide.c.h(parcel, i21, Uri.CREATOR);
                            break;
                        case 6:
                            strI19 = com.bumptech.glide.c.i(i21, parcel);
                            break;
                        case 7:
                            strI20 = com.bumptech.glide.c.i(i21, parcel);
                            break;
                        case '\b':
                            strI21 = com.bumptech.glide.c.i(i21, parcel);
                            break;
                        case '\t':
                            xVar = (x) com.bumptech.glide.c.h(parcel, i21, x.CREATOR);
                            break;
                        default:
                            com.bumptech.glide.c.R(i21, parcel);
                            break;
                    }
                }
                com.bumptech.glide.c.n(iS13, parcel);
                return new l(strI15, strI16, strI17, strI18, uri, strI19, strI20, strI21, xVar);
            case 13:
                int iS14 = com.bumptech.glide.c.S(parcel);
                String strI22 = null;
                String strI23 = null;
                while (parcel.dataPosition() < iS14) {
                    int i22 = parcel.readInt();
                    char c13 = (char) i22;
                    if (c13 == 1) {
                        strI22 = com.bumptech.glide.c.i(i22, parcel);
                    } else if (c13 != 2) {
                        com.bumptech.glide.c.R(i22, parcel);
                    } else {
                        strI23 = com.bumptech.glide.c.i(i22, parcel);
                    }
                }
                com.bumptech.glide.c.n(iS14, parcel);
                return new m(strI22, strI23);
            case 14:
                return new Parcelable(parcel) { // from class: android.support.v4.media.MediaBrowserCompat$MediaItem
                    public static final Parcelable.Creator<MediaBrowserCompat$MediaItem> CREATOR = new n(14);

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final int f289a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final MediaDescriptionCompat f290b;

                    {
                        this.f289a = parcel.readInt();
                        this.f290b = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
                    }

                    @Override // android.os.Parcelable
                    public final int describeContents() {
                        return 0;
                    }

                    public final String toString() {
                        return "MediaItem{mFlags=" + this.f289a + ", mDescription=" + this.f290b + '}';
                    }

                    @Override // android.os.Parcelable
                    public final void writeToParcel(Parcel parcel2, int i23) {
                        parcel2.writeInt(this.f289a);
                        this.f290b.writeToParcel(parcel2, i23);
                    }
                };
            case 15:
                Object objCreateFromParcel = MediaDescription.CREATOR.createFromParcel(parcel);
                if (objCreateFromParcel == null) {
                    return null;
                }
                MediaDescription mediaDescription = (MediaDescription) objCreateFromParcel;
                String mediaId = mediaDescription.getMediaId();
                CharSequence title = mediaDescription.getTitle();
                CharSequence subtitle = mediaDescription.getSubtitle();
                CharSequence description = mediaDescription.getDescription();
                Bitmap iconBitmap = mediaDescription.getIconBitmap();
                Uri iconUri = mediaDescription.getIconUri();
                Bundle extras = mediaDescription.getExtras();
                if (extras != null) {
                    extras.setClassLoader(android.support.v4.media.session.a.class.getClassLoader());
                    mediaUri = (Uri) extras.getParcelable("android.support.v4.media.description.MEDIA_URI");
                } else {
                    mediaUri = null;
                }
                if (mediaUri == null) {
                    bundle = extras;
                } else if (extras.containsKey("android.support.v4.media.description.NULL_BUNDLE_FLAG") && extras.size() == 2) {
                    bundle = null;
                } else {
                    extras.remove("android.support.v4.media.description.MEDIA_URI");
                    extras.remove("android.support.v4.media.description.NULL_BUNDLE_FLAG");
                    bundle = extras;
                }
                if (mediaUri == null) {
                    mediaUri = mediaDescription.getMediaUri();
                }
                MediaDescriptionCompat mediaDescriptionCompat = new MediaDescriptionCompat(mediaId, title, subtitle, description, iconBitmap, iconUri, bundle, mediaUri);
                mediaDescriptionCompat.f298t = objCreateFromParcel;
                return mediaDescriptionCompat;
            case 16:
                return new MediaMetadataCompat(parcel);
            case 17:
                return new RatingCompat(parcel.readInt(), parcel.readFloat());
            case 18:
                return new Parcelable(parcel) { // from class: android.support.v4.media.session.MediaSessionCompat$QueueItem
                    public static final Parcelable.Creator<MediaSessionCompat$QueueItem> CREATOR = new n(18);

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final MediaDescriptionCompat f302a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final long f303b;

                    {
                        this.f302a = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
                        this.f303b = parcel.readLong();
                    }

                    @Override // android.os.Parcelable
                    public final int describeContents() {
                        return 0;
                    }

                    public final String toString() {
                        StringBuilder sb2 = new StringBuilder("MediaSession.QueueItem {Description=");
                        sb2.append(this.f302a);
                        sb2.append(", Id=");
                        return q1.a.l(sb2, this.f303b, " }");
                    }

                    @Override // android.os.Parcelable
                    public final void writeToParcel(Parcel parcel2, int i23) {
                        this.f302a.writeToParcel(parcel2, i23);
                        parcel2.writeLong(this.f303b);
                    }
                };
            case 19:
                MediaSessionCompat$ResultReceiverWrapper mediaSessionCompat$ResultReceiverWrapper = new MediaSessionCompat$ResultReceiverWrapper();
                mediaSessionCompat$ResultReceiverWrapper.f304a = (ResultReceiver) ResultReceiver.CREATOR.createFromParcel(parcel);
                return mediaSessionCompat$ResultReceiverWrapper;
            case 20:
                final Parcelable parcelable = parcel.readParcelable(null);
                return new Parcelable(parcelable) { // from class: android.support.v4.media.session.MediaSessionCompat$Token
                    public static final Parcelable.Creator<MediaSessionCompat$Token> CREATOR = new n(20);

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final Object f305a;

                    {
                        this.f305a = parcelable;
                    }

                    @Override // android.os.Parcelable
                    public final int describeContents() {
                        return 0;
                    }

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof MediaSessionCompat$Token)) {
                            return false;
                        }
                        Object obj2 = ((MediaSessionCompat$Token) obj).f305a;
                        Object obj3 = this.f305a;
                        if (obj3 == null) {
                            return obj2 == null;
                        }
                        if (obj2 == null) {
                            return false;
                        }
                        return obj3.equals(obj2);
                    }

                    public final int hashCode() {
                        Object obj = this.f305a;
                        if (obj == null) {
                            return 0;
                        }
                        return obj.hashCode();
                    }

                    @Override // android.os.Parcelable
                    public final void writeToParcel(Parcel parcel2, int i23) {
                        parcel2.writeParcelable((Parcelable) this.f305a, i23);
                    }
                };
            case zzbbs.zzt.zzm /* 21 */:
                ParcelableVolumeInfo parcelableVolumeInfo = new ParcelableVolumeInfo();
                parcelableVolumeInfo.f306a = parcel.readInt();
                parcelableVolumeInfo.f308c = parcel.readInt();
                parcelableVolumeInfo.f309d = parcel.readInt();
                parcelableVolumeInfo.e = parcel.readInt();
                parcelableVolumeInfo.f307b = parcel.readInt();
                return parcelableVolumeInfo;
            case 22:
                return new PlaybackStateCompat(parcel);
            case 23:
                return new androidx.activity.result.a(parcel);
            case 24:
                jc.i.e(parcel, "inParcel");
                Parcelable parcelable2 = parcel.readParcelable(IntentSender.class.getClassLoader());
                jc.i.b(parcelable2);
                return new androidx.activity.result.h((IntentSender) parcelable2, (Intent) parcel.readParcelable(Intent.class.getClassLoader()), parcel.readInt(), parcel.readInt());
            case 25:
                return new androidx.fragment.app.b(parcel);
            case 26:
                f0 f0Var = new f0();
                f0Var.f866a = parcel.readString();
                f0Var.f867b = parcel.readInt();
                return f0Var;
            case 27:
                j0 j0Var = new j0();
                j0Var.e = null;
                j0Var.f905f = new ArrayList();
                j0Var.f906r = new ArrayList();
                j0Var.f901a = parcel.createTypedArrayList(m0.CREATOR);
                j0Var.f902b = parcel.createStringArrayList();
                j0Var.f903c = (androidx.fragment.app.b[]) parcel.createTypedArray(androidx.fragment.app.b.CREATOR);
                j0Var.f904d = parcel.readInt();
                j0Var.e = parcel.readString();
                j0Var.f905f = parcel.createStringArrayList();
                j0Var.f906r = parcel.createTypedArrayList(Bundle.CREATOR);
                j0Var.f907s = parcel.createTypedArrayList(f0.CREATOR);
                return j0Var;
            case 28:
                return new m0(parcel);
            default:
                int iS15 = com.bumptech.glide.c.S(parcel);
                Intent intent = null;
                int iJ6 = 0;
                int iJ7 = 0;
                while (parcel.dataPosition() < iS15) {
                    int i23 = parcel.readInt();
                    char c14 = (char) i23;
                    if (c14 == 1) {
                        iJ6 = com.bumptech.glide.c.J(i23, parcel);
                    } else if (c14 == 2) {
                        iJ7 = com.bumptech.glide.c.J(i23, parcel);
                    } else if (c14 != 3) {
                        com.bumptech.glide.c.R(i23, parcel);
                    } else {
                        intent = (Intent) com.bumptech.glide.c.h(parcel, i23, Intent.CREATOR);
                    }
                }
                com.bumptech.glide.c.n(iS15, parcel);
                return new b8.b(iJ6, iJ7, intent);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.f242a) {
            case 0:
                return new e[i];
            case 1:
                return new f[i];
            case 2:
                return new g[i];
            case 3:
                return new h[i];
            case 4:
                return new a[i];
            case 5:
                return new b[i];
            case 6:
                return new c[i];
            case 7:
                return new d[i];
            case 8:
                return new SaveAccountLinkingTokenRequest[i];
            case 9:
                return new i[i];
            case 10:
                return new j[i];
            case 11:
                return new k[i];
            case 12:
                return new l[i];
            case 13:
                return new m[i];
            case 14:
                return new MediaBrowserCompat$MediaItem[i];
            case 15:
                return new MediaDescriptionCompat[i];
            case 16:
                return new MediaMetadataCompat[i];
            case 17:
                return new RatingCompat[i];
            case 18:
                return new MediaSessionCompat$QueueItem[i];
            case 19:
                return new MediaSessionCompat$ResultReceiverWrapper[i];
            case 20:
                return new MediaSessionCompat$Token[i];
            case zzbbs.zzt.zzm /* 21 */:
                return new ParcelableVolumeInfo[i];
            case 22:
                return new PlaybackStateCompat[i];
            case 23:
                return new androidx.activity.result.a[i];
            case 24:
                return new androidx.activity.result.h[i];
            case 25:
                return new androidx.fragment.app.b[i];
            case 26:
                return new f0[i];
            case 27:
                return new j0[i];
            case 28:
                return new m0[i];
            default:
                return new b8.b[i];
        }
    }
}

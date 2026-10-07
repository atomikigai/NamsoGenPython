package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new b8.f(17);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r f2409a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r f2410b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f2411c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final r f2412d;
    public final int e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f2413f;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f2414r;

    public b(r rVar, r rVar2, d dVar, r rVar3, int i) {
        Objects.requireNonNull(rVar, "start cannot be null");
        Objects.requireNonNull(rVar2, "end cannot be null");
        Objects.requireNonNull(dVar, "validator cannot be null");
        this.f2409a = rVar;
        this.f2410b = rVar2;
        this.f2412d = rVar3;
        this.e = i;
        this.f2411c = dVar;
        if (rVar3 != null && rVar.f2455a.compareTo(rVar3.f2455a) > 0) {
            throw new IllegalArgumentException("start Month cannot be after current Month");
        }
        if (rVar3 != null && rVar3.f2455a.compareTo(rVar2.f2455a) > 0) {
            throw new IllegalArgumentException("current Month cannot be after end Month");
        }
        if (i < 0 || i > z.c(null).getMaximum(7)) {
            throw new IllegalArgumentException("firstDayOfWeek is not valid");
        }
        this.f2414r = rVar.d(rVar2) + 1;
        this.f2413f = (rVar2.f2457c - rVar.f2457c) + 1;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f2409a.equals(bVar.f2409a) && this.f2410b.equals(bVar.f2410b) && p0.b.a(this.f2412d, bVar.f2412d) && this.e == bVar.e && this.f2411c.equals(bVar.f2411c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f2409a, this.f2410b, this.f2412d, Integer.valueOf(this.e), this.f2411c});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f2409a, 0);
        parcel.writeParcelable(this.f2410b, 0);
        parcel.writeParcelable(this.f2412d, 0);
        parcel.writeParcelable(this.f2411c, 0);
        parcel.writeInt(this.e);
    }
}

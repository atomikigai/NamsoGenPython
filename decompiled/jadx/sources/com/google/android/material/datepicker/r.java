package com.google.android.material.datepicker;

import android.icu.text.DateFormat;
import android.icu.text.DisplayContext;
import android.icu.util.TimeZone;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class r implements Comparable, Parcelable {
    public static final Parcelable.Creator<r> CREATOR = new b8.f(19);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Calendar f2455a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f2456b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f2457c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f2458d;
    public final int e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f2459f;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public String f2460r;

    public r(Calendar calendar) {
        calendar.set(5, 1);
        Calendar calendarA = z.a(calendar);
        this.f2455a = calendarA;
        this.f2456b = calendarA.get(2);
        this.f2457c = calendarA.get(1);
        this.f2458d = calendarA.getMaximum(7);
        this.e = calendarA.getActualMaximum(5);
        this.f2459f = calendarA.getTimeInMillis();
    }

    public static r a(int i, int i10) {
        Calendar calendarC = z.c(null);
        calendarC.set(1, i);
        calendarC.set(2, i10);
        return new r(calendarC);
    }

    public static r b(long j4) {
        Calendar calendarC = z.c(null);
        calendarC.setTimeInMillis(j4);
        return new r(calendarC);
    }

    public final String c() {
        if (this.f2460r == null) {
            long timeInMillis = this.f2455a.getTimeInMillis();
            Locale locale = Locale.getDefault();
            AtomicReference atomicReference = z.f2473a;
            DateFormat instanceForSkeleton = DateFormat.getInstanceForSkeleton("yMMMM", locale);
            instanceForSkeleton.setTimeZone(TimeZone.getTimeZone("UTC"));
            instanceForSkeleton.setContext(DisplayContext.CAPITALIZATION_FOR_STANDALONE);
            this.f2460r = instanceForSkeleton.format(new Date(timeInMillis));
        }
        return this.f2460r;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f2455a.compareTo(((r) obj).f2455a);
    }

    public final int d(r rVar) {
        if (!(this.f2455a instanceof GregorianCalendar)) {
            throw new IllegalArgumentException("Only Gregorian calendars are supported.");
        }
        return (rVar.f2456b - this.f2456b) + ((rVar.f2457c - this.f2457c) * 12);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return this.f2456b == rVar.f2456b && this.f2457c == rVar.f2457c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f2456b), Integer.valueOf(this.f2457c)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f2457c);
        parcel.writeInt(this.f2456b);
    }
}

package androidx.emoji2.text;

import android.os.Build;
import android.text.Spannable;
import android.text.SpannableString;
import java.util.stream.IntStream;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class y implements Spannable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f810a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Spannable f811b;

    public y(Spannable spannable) {
        this.f811b = spannable;
    }

    public final void a() {
        Spannable spannable = this.f811b;
        if (!this.f810a) {
            if ((Build.VERSION.SDK_INT < 28 ? new b9.e(3) : new x(3)).v(spannable)) {
                this.f811b = new SpannableString(spannable);
            }
        }
        this.f810a = true;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        return this.f811b.charAt(i);
    }

    @Override // java.lang.CharSequence
    public final IntStream chars() {
        return this.f811b.chars();
    }

    @Override // java.lang.CharSequence
    public final IntStream codePoints() {
        return this.f811b.codePoints();
    }

    @Override // android.text.Spanned
    public final int getSpanEnd(Object obj) {
        return this.f811b.getSpanEnd(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanFlags(Object obj) {
        return this.f811b.getSpanFlags(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanStart(Object obj) {
        return this.f811b.getSpanStart(obj);
    }

    @Override // android.text.Spanned
    public final Object[] getSpans(int i, int i10, Class cls) {
        return this.f811b.getSpans(i, i10, cls);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f811b.length();
    }

    @Override // android.text.Spanned
    public final int nextSpanTransition(int i, int i10, Class cls) {
        return this.f811b.nextSpanTransition(i, i10, cls);
    }

    @Override // android.text.Spannable
    public final void removeSpan(Object obj) {
        a();
        this.f811b.removeSpan(obj);
    }

    @Override // android.text.Spannable
    public final void setSpan(Object obj, int i, int i10, int i11) {
        a();
        this.f811b.setSpan(obj, i, i10, i11);
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i10) {
        return this.f811b.subSequence(i, i10);
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.f811b.toString();
    }

    public y(CharSequence charSequence) {
        this.f811b = new SpannableString(charSequence);
    }
}

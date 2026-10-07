package com.firebase.ui.auth.ui.phone;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.style.ScaleXSpan;
import android.util.AttributeSet;
import android.widget.TextView;
import com.google.android.material.textfield.TextInputEditText;
import r4.k;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class SpacedEditText extends TextInputEditText {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final float f1947t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public SpannableStringBuilder f1948u;

    public SpacedEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1948u = new SpannableStringBuilder("");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, k.f8171a);
        this.f1947t = typedArrayObtainStyledAttributes.getFloat(0, 1.0f);
        typedArrayObtainStyledAttributes.recycle();
    }

    public Editable getUnspacedText() {
        return this.f1948u;
    }

    @Override // android.widget.EditText
    public void setSelection(int i) {
        int iMin = Math.min(Math.max((i * 2) - 1, 0), (this.f1948u.length() * 2) - 1);
        try {
            super.setSelection(iMin);
        } catch (IndexOutOfBoundsException e) {
            throw new IndexOutOfBoundsException(e.getMessage() + ", requestedIndex=" + i + ", newIndex= " + iMin + ", originalText=" + ((Object) this.f1948u));
        }
    }

    @Override // android.widget.EditText, android.widget.TextView
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        int i;
        this.f1948u = new SpannableStringBuilder(charSequence);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        int length = charSequence.length();
        int i10 = -1;
        int i11 = 0;
        while (true) {
            i = length - 1;
            if (i11 >= i) {
                break;
            }
            spannableStringBuilder.append(charSequence.charAt(i11));
            spannableStringBuilder.append((CharSequence) " ");
            int i12 = i10 + 2;
            spannableStringBuilder.setSpan(new ScaleXSpan(this.f1947t), i12, i10 + 3, 33);
            i11++;
            i10 = i12;
        }
        if (length != 0) {
            spannableStringBuilder.append(charSequence.charAt(i));
        }
        super.setText(spannableStringBuilder, TextView.BufferType.SPANNABLE);
    }
}

package com.gmail.at.bartoszpop.stackoverflow.proposals.generics;

import java.util.List;
import java.util.Map.Entry;

import org.hamcrest.Matcher;

import com.google.common.collect.Lists;

@SuppressWarnings("unused")
public class ParametrizedTypeContainment {
	public void question1() {
//        Matcher<? super Entry<?, ? extends String>> metch = null;
//        List<Matcher<? super Entry<? extends String, ? extends String>>> testEntryMatchers = Lists.newArrayList(metch);
        //List<Object> e = Lists.newArrayList(metch);
//		Matcher<? super Entry<?, ? extends String>> matcher = null;
//		List<Matcher<? super Entry<?, ? extends String>>> entryMatchers = Lists.newArrayList(matcher);
//		entryMatchers.add(matcher);

		// czemy to si� nie kompiluje?
//		List<Matcher<? super Entry<?, ? extends String>>> entryMatchers2 = Lists.newArrayList(matcher);		
//		List<Matcher<? super Entry<?, ? extends String>>> entryMatchers3 = Lists.newArrayList(createMatcher());
	}
	
	private static Matcher<? super Entry<?, ? extends String>> createMatcher() {
		return null;
	}

	// public static void main(String[] args) {
	// // List<List<? super Entry>> list1 = null;
	// // test(list1); // compile
	// // ParametrizedTypeContainment.<SubEntry> test(list1); // does not
	// compile
	// //
	// // List<List<? super SubEntry>> list2 = null;
	// // test(list2); // compile
	// // ParametrizedTypeContainment.<Entry> test(list2); // does not compile
	// //
	// // List<List<?>> list3 = null;
	// // test(list3); // does not compile
	// // ParametrizedTypeContainment.<Entry> test(list3); // does not compile
	// //
	// // List<List<? super Entry<?, ?>>> list4 = null;
	// // test(list4); // compile
	//
	// List<Matcher<Entry<? extends String, ? extends String>>> entryMatchers =
	// null;
	// List<Matcher<Entry>> entryMatchers2 = null; // działa dla List<Matcher<?
	// super Entry>>
	// // działa dla List<Matcher<? super Entry>> i działa dla List<Matcher<?
	// super Object>>
	// // nie działa List<Matcher<?>> lub List<Matcher<Object>> nie
	// List<Matcher<? super Object>> entryMatchers3 = null;
	// // ParametrizedTypeContainment.<Entry<? extends String, ? extends
	// String>> containsInAnyOrder(entryMatchers);
	// // ParametrizedTypeContainment.containsInAnyOrder(entryMatchers2);
	// ParametrizedTypeContainment.containsInAnyOrder(entryMatchers3);
	// // ParametrizedTypeContainment.<Entry> containsInAnyOrder(entryMatchers);
	// // = FluentIterable.from(EMAIL_ADDRESSES)
	// // .transform(TO_IDENTITY_ENTRY_MATCHER)
	// // .toList();
	//
	// // List<List> x = null;
	// // List<List<?>> list1 = (List) x;
	// // System.out.println(list1);
	//
	// // matcher ktory porowna wszystko rtakze entry
	// // List<Matcher<?>> entryMatchers = null;
	// // Object result = UserEmailResolverTest.<Entry>
	// containsInAnyOrder(entryMatchers);
	//
	// // czy java.lang.Iterable<? extends T>>
	// // org.hamcrest.Matcher<? super Entry> zawiera Matcher<Entry> ale nie
	// zawiera List<Matcher<Entry>> ani Matcher<Entry<? extends String, ?
	// extends
	// // String>>
	// // dlatego
	// // @see
	// pl.azimuthit.comm.web.controller.messages.compose.resolvers.UserEmailResolverTest.verifyVariable(Map<String,
	// String>)
	//
	// // czy org.hamcrest.Matcher<? super Entry> zawiera Matcher<Entry<?
	// extends String, ? extends String>>
	//
	// // Assert.assertThat(variable.entrySet(), );
	// }
	//
	// public static <T> void test(List<List<? super T>> itemMatchers) {
	// }
	//
	// // public static <T> org.hamcrest.Matcher<java.lang.Iterable<? extends
	// T>> containsInAnyOrder(T... items) {
	// // return null;
	// // }
	//
	// public static <T> org.hamcrest.Matcher<java.lang.Iterable<? extends T>>
	// containsInAnyOrder(
	// java.util.Collection<org.hamcrest.Matcher<? super T>> itemMatchers) {
	// return null;
	// }
	//
	// private static class SubEntry implements Entry {
	// @Override
	// public Object getKey() {
	// return null;
	// }
	//
	// @Override
	// public Object getValue() {
	// return null;
	// }
	//
	// @Override
	// public Object setValue(Object value) {
	// return null;
	// }
	// }
}